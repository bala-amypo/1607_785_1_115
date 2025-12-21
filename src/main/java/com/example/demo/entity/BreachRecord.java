package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class BreachRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long shipmentId;
    private Long logId;
    private String breachType;
    private Double breachValue;
    private String severity;
    private String details;
    private LocalDateTime detectedAt;
    private Boolean resolved;

    @PrePersist
    public void onCreate() {
        detectedAt = LocalDateTime.now();
        resolved = false;
    }

    // getters & setters
}