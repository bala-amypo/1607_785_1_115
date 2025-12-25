package com.example.demo.entity;

import java.time.LocalDateTime;

public class AlertRecord {
    private Long id;
    private Long shipmentId;
    private Long breachId;
    private Boolean acknowledged;
    private LocalDateTime sentAt;

    public void prePersist() {
        if (acknowledged == null) acknowledged = false;
        sentAt = LocalDateTime.now();
    }

    // getters & setters
}
