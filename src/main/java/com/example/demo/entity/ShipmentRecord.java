package com.example.demo.entity;

public class Shipment {

    private Long id;
    private String productName;
    private double minTemp;
    private double maxTemp;

    // Constructors
    public Shipment() {}
    public Shipment(Long id, String productName, double minTemp, double maxTemp) {
        this.id = id;
        this.productName = productName;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public double getMinTemp() { return minTemp; }
    public void setMinTemp(double minTemp) { this.minTemp = minTemp; }

    public double getMaxTemp() { return maxTemp; }
    public void setMaxTemp(double maxTemp) { this.maxTemp = maxTemp; }
}
