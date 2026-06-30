package com.lane.app.guide;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "messages")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String sessionId; // anonymous session identifier, no auth yet

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Sender sender; // USER or GUIDE

    @Column(nullable = false, columnDefinition = "TEXT")
    private String content;

    @Column(nullable = false)
    private Instant createdAt = Instant.now();

    public enum Sender { USER, GUIDE }

    protected Message() {} // required by JPA

    public Message(String sessionId, Sender sender, String content) {
        this.sessionId = sessionId;
        this.sender = sender;
        this.content = content;
    }

    public Long getId() { return id; }
    public String getSessionId() { return sessionId; }
    public Sender getSender() { return sender; }
    public String getContent() { return content; }
    public Instant getCreatedAt() { return createdAt; }
}