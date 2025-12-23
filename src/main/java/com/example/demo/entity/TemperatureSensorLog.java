package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class TemperatureSensorLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private ShipmentRecord shipment;

    private String sensorId;

    private LocalDateTime recordedAt;
    private Double temperatureValue;
    private String location;

    @PrePersist
    void onCreate() {
        recordedAt = LocalDateTime.now();
    }

    public TemperatureSensorLog() {}

    public Long getId() { return id; }
    public ShipmentRecord getShipment() { return shipment; }
    public void setShipment(ShipmentRecord shipment) { this.shipment = shipment; }
    public String getSensorId() { return sensorId; }
    public void setSensorId(String sensorId) { this.sensorId = sensorId; }
    public LocalDateTime getRecordedAt() { return recordedAt; }
    public Double getTemperatureValue() { return temperatureValue; }
    public void setTemperatureValue(Double temperatureValue) { this.temperatureValue = temperatureValue; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
}
