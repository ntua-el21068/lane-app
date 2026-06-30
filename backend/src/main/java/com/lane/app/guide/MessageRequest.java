/*
 * Αναφέρεται σε κάποιο σεσσιόν και περιέχει κοντέντ , και μεθόδους γετ σετ.
 */

package com.lane.app.guide;

public class MessageRequest {
    private String sessionId;
    private String content;

    // Getters and Setters
    public String getSessionId() { return sessionId; }
    public void setSessionId(String sessionId) { this.sessionId = sessionId; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
}