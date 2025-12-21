package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "alert_records")
public class AlertRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long shipmentId;
    private Long breachId;
    private boolean acknowledged;
    private LocalDateTime sentAt;

    public AlertRecord() {}

    public AlertRecord(Long shipmentId, Long breachId) {
        this.shipmentId = shipmentId;
        this.breachId = breachId;
    }

    @PrePersist
    public void init() {
        acknowledged = false;
        sentAt = LocalDateTime.now();
    }
}