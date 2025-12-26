package com.example.demo.controller;

import com.example.demo.entity.ShipmentRecord;
import com.example.demo.service.ShipmentRecordService;

public class ShipmentRecordController {

    private final ShipmentRecordService service;

    public ShipmentRecordController(ShipmentRecordService service) {
        this.service = service;
    }

    public ShipmentRecord createShipment(ShipmentRecord s) {
        return service.createShipment(s);
    }

    public ShipmentRecord updateShipmentStatus(Long id, String status) {
        return service.updateShipmentStatus(id, status);
    }

    public ShipmentRecord getShipmentByCode(String code) {
        return service.getShipmentByCode(code).orElse(null);
    }
}
