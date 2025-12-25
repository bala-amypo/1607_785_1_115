package com.example.demo.entity;

public class BreachRecord {
    private Long id;
    private Long shipmentId;
    private Long logId;
    private Double breachValue;
    private Boolean resolved;
    private String severity;

    public void prePersist() {
        if (resolved == null) resolved = false;
    }

    // getters & setters
}
