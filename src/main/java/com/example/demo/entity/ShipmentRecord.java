package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "shipment_records")
public class ShipmentRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String shipmentCode;
    private String origin;
    private String destination;
    private String status;

    public ShipmentRecord() {}

    public ShipmentRecord(String shipmentCode, String origin, String destination, String status) {
        this.shipmentCode = shipmentCode;
        this.origin = origin;
        this.destination = destination;
        this.status = status;
    }

    @PrePersist
    public void defaultStatus() {
        if (status == null) {
            status = "IN_TRANSIT";
        }
    }

    // getters & setters
    public Long getId() { return id; }
    public String getShipmentCode() { return shipmentCode; }
    public String getOrigin() { return origin; }
    public String getDestination() { return destination; }
    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }
}