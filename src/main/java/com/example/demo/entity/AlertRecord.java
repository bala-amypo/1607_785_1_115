package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class AlertRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long shipmentId;
    private Long breachId;
    private String alertType;
    private String message;
    private LocalDateTime sentAt;
    private Boolean acknowledged;

    @PrePersist
    public void onCreate() {
        sentAt = LocalDateTime.now();
        acknowledged = false;
    }

    // getters & setters
}