/*
 * Response Structure (MessageResponse.java) [MessageResponse]
 */

package com.lane.app.guide;

import java.time.LocalDateTime;

public class MessageResponse {
    private String id;
    private String sender; // "USER" or "ASSISTANT"
    private String content;
    private LocalDateTime timestamp;

    public MessageResponse(String id, String sender, String content, LocalDateTime timestamp) {
        this.id = id;
        this.sender = sender;
        this.content = content;
        this.timestamp = timestamp;
    }

    // Getters
    public String getId() { return id; }
    public String getSender() { return sender; }
    public String getContent() { return content; }
    public LocalDateTime getTimestamp() { return timestamp; }
}