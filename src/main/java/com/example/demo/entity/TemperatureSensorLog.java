package com.example.demo.entity;

public class TemperatureSensorLog {

    private Long id;
    private Long shipmentId;
    private Double temperatureValue;
    private String location;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getShipmentId() { return shipmentId; }
    public void setShipmentId(Long shipmentId) { this.shipmentId = shipmentId; }

    public Double getTemperatureValue() { return temperatureValue; }
    public void setTemperatureValue(Double temperatureValue) {
        this.temperatureValue = temperatureValue;
    }

    public String getLocation() { return location; }
    public void setLocation(String location) {
        this.location = location;
    }
}
