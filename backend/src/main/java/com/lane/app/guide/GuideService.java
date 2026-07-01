package com.lane.app.guide;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.Map;

@Service
public class GuideService {

    private final MessageRepository repo;
    private final WebClient webClient;

    @Value("${lane.llm.provider-url}")
    private String providerUrl;

    @Value("${lane.llm.model}")
    private String model;

    @Value("${lane.llm.api-key}")
    private String apiKey;

    // System prompt — the Guide's personality kernel
    private static final String SYSTEM_PROMPT = """
        You are the Guide — a calm, honest, and present companion in the Lane app.
        You help the user navigate their life through seasons and moments.
        You are NOT a therapist. You do NOT give diagnoses or clinical advice.
        You do NOT tell the user what they want to hear — you reflect what they show you.
        You are warm but direct. You never moralize or lecture.
        Keep responses concise (2-4 sentences) unless the user clearly needs more.
        """;

    public GuideService(MessageRepository repo, WebClient.Builder webClientBuilder) {
        this.repo = repo;
        this.webClient = webClientBuilder.build();
    }

    public MessageResponse handleUserMessage(String sessionId, String userContent) {
        // 1. Persist user message
        Message userMessage = repo.save(
                new Message(sessionId, Message.Sender.USER, userContent)
        );

        // 2. Load conversation history for context
        List<Message> history = repo.findBySessionIdOrderByCreatedAtAsc(sessionId);

        // 3. Build messages array for the LLM
        List<Map<String, String>> llmMessages = new java.util.ArrayList<>();
        llmMessages.add(Map.of("role", "system", "content", SYSTEM_PROMPT));
        for (Message m : history) {
            String role = m.getSender() == Message.Sender.USER ? "user" : "assistant";
            llmMessages.add(Map.of("role", role, "content", m.getContent()));
        }

        // 4. Call Groq API
        Map<String, Object> requestBody = Map.of(
                "model", model,
                "messages", llmMessages,
                "max_tokens", 300
        );

        Map response = webClient.post()
                .uri(providerUrl)
                .header("Authorization", "Bearer " + apiKey)
                .header("Content-Type", "application/json")
                .bodyValue(requestBody)
                .retrieve()
                .bodyToMono(Map.class)
                .block();

        // 5. Extract text from response
        String guideContent = extractContent(response);

        // 6. Persist Guide response
        Message guideMessage = repo.save(
                new Message(sessionId, Message.Sender.GUIDE, guideContent)
        );

        return MessageResponse.from(guideMessage);
    }

    @SuppressWarnings("unchecked")
    private String extractContent(Map response) {
        try {
            var choices = (List<Map>) response.get("choices");
            var message = (Map<String, String>) choices.get(0).get("message");
            return message.get("content");
        } catch (Exception e) {
            return "I'm having trouble connecting right now. Try again in a moment.";
        }
    }
}