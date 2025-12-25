package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "shipment_records", uniqueConstraints = @UniqueConstraint(columnNames = "shipmentCode"))
public class ShipmentRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String shipmentCode;
    private String origin;
    private String destination;
    private String productType;
    private LocalDateTime startDate;
    private LocalDateTime expectedDelivery;
    private String status;
    private LocalDateTime createdAt;

    public ShipmentRecord() {}

    @PrePersist
    void prePersist() {
        if (status == null) {
            status = "IN_TRANSIT";
        }
        createdAt = LocalDateTime.now();
    }

    // getters & setters
}