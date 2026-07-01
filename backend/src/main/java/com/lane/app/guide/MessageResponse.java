package com.lane.app.guide;

import java.time.Instant;

public record MessageResponse(
        Long id,
        String sessionId,
        String sender,
        String content,
        Instant createdAt
) {
    // Προσθέσαμε το public εδώ για να μπορεί να το καλέσει ο GuideService
    public static MessageResponse from(Message m) {
        return new MessageResponse(
                m.getId(),
                m.getSessionId(),
                m.getSender().name(),
                m.getContent(),
                m.getCreatedAt()
        );
    }
}