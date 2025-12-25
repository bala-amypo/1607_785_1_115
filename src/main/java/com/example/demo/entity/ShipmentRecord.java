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

    // getters & setters
}
