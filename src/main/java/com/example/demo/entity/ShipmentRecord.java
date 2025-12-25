package com.example.demo.entity;

public class ShipmentRecord {

    private Long id;
    private String shipmentCode;
    private String status;
    private String origin;
    private String destination;

    public void prePersist() {
        if (status == null) status = "IN_TRANSIT";
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getShipmentCode() { return shipmentCode; }
    public void setShipmentCode(String shipmentCode) { this.shipmentCode = shipmentCode; }

    public String getStatus() { return status; }

    // ✅ THIS METHOD WAS MISSING
    public void setStatus(String status) {
        this.status = status;
    }

    public String getOrigin() { return origin; }
    public void setOrigin(String origin) { this.origin = origin; }

    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }
}
q