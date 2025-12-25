package com.example.demo.controller;

import com.example.demo.entity.BreachRecord;
import com.example.demo.service.BreachDetectionService;
import java.util.List;

public class BreachRecordController {

    private final BreachDetectionService service;

    public BreachRecordController(BreachDetectionService service) {
        this.service = service;
    }

    public BreachRecord logBreach(BreachRecord b) {
        return service.logBreach(b);
    }

    public BreachRecord resolveBreach(Long id) {
        return service.resolveBreach(id);
    }

    public List<BreachRecord> getBreachesByShipment(Long shipmentId) {
        return service.getBreachesByShipment(shipmentId);
    }
}
