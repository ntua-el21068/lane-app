/*
 * The Controller (MessageController.java) , imports ResponseEntity and Annotations από springboot http.
 * annot. RestController, RequestMapping(link), CrossOrigin(link)
 * {MessageController, annot PostMapping(endpoint) , ResponseEntity (annot RequestBody, MessageRequest)}
 * mock reply
 * messageResponse
 * returns ResponseEntity.ok(mockreply)
 */

package com.lane.app.controller;

import com.lane.app.guide.MessageRequest;
import com.lane.app.guide.MessageResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.UUID;

@RestController
@RequestMapping("/api/guide")
@CrossOrigin(origins = "http://localhost:4200") // Allows your Angular app to talk to Spring Boot
public class MessageController {

    @PostMapping("/messages")
    public ResponseEntity<MessageResponse> handleGuideMessage(@RequestBody MessageRequest request) {

        // LOGIC: For now, we bypass the LLM and instantly mock a "Guide" persona response
        String mockAiReply = "Hello! I am your Guide. You said: '" + request.getContent() + "'. How can I help you further?";

        MessageResponse mockResponse = new MessageResponse(
                UUID.randomUUID().toString(),
                "ASSISTANT",
                mockAiReply,
                LocalDateTime.now()
        );

        return ResponseEntity.ok(mockResponse);
    }
}