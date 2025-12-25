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

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getShipmentId() { return shipmentId; }
    public void setShipmentId(Long shipmentId) { this.shipmentId = shipmentId; }

    public Long getLogId() { return logId; }
    public void setLogId(Long logId) { this.logId = logId; }

    public Double getBreachValue() { return breachValue; }
    public void setBreachValue(Double breachValue) { this.breachValue = breachValue; }

    public Boolean getResolved() { return resolved; }

    // ✅ THIS METHOD WAS MISSING
    public void setResolved(Boolean resolved) {
        this.resolved = resolved;
    }

    public String getSeverity() { return severity; }
    public void setSeverity(String severity) { this.severity = severity; }
}
