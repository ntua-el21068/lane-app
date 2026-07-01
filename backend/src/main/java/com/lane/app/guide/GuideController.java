package com.lane.app.guide;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/guide")
public class GuideController {

    private final GuideService guideService;

    public GuideController(GuideService guideService) {
        this.guideService = guideService;
    }

    @PostMapping("/messages")
    public ResponseEntity<MessageResponse> sendMessage(@RequestBody MessageRequest request) {
        MessageResponse response = guideService.handleUserMessage(
                request.sessionId(), request.content()
        );
        return ResponseEntity.ok(response);
    }
}