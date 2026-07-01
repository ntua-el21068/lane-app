package com.lane.app.controller;

import com.lane.app.guide.MessageRequest;
import com.lane.app.guide.MessageResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.Random;

@RestController
@RequestMapping("/api/guide")
@CrossOrigin(origins = "http://localhost:4200") // Allows your Angular app to talk to Spring Boot
public class MessageController {

    @PostMapping("/mock-messages")
    public ResponseEntity<MessageResponse> handleGuideMessage(@RequestBody MessageRequest request) {

        // LOGIC: For now, we bypass the LLM and instantly mock a "Guide" persona response
        // Αλλάξαμε το request.getContent() σε request.content()
        String mockAiReply = "Hello! I am your Guide. You said: '" + request.content() + "'. How can I help you further?";

        // Προσαρμογή στον constructor του νέου MessageResponse Record
        MessageResponse mockResponse = new MessageResponse(
                new Random().nextLong(100000), // Long id αντί για UUID String
                "mock-session",                 // sessionId
                "GUIDE",                        // sender (αντί για ASSISTANT, για να ταιριάζει με το GuideService)
                mockAiReply,                    // content
                Instant.now()                   // Instant αντί για LocalDateTime
        );

        return ResponseEntity.ok(mockResponse);
    }
}