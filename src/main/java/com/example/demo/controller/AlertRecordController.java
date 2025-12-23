package com.example.demo.controller;

import com.example.demo.entity.AlertRecord;
import com.example.demo.service.AlertService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alerts")
public class AlertRecordController {

    private final AlertService service;

    public AlertRecordController(AlertService service) {
        this.service = service;
    }

    @PostMapping
    public AlertRecord create(@RequestBody AlertRecord record) {
        return service.create(record);
    }

    @PutMapping("/{id}")
    public AlertRecord update(
            @PathVariable Long id,
            @RequestBody AlertRecord record) {
        return service.update(id, record);
    }

    @GetMapping
    public List<AlertRecord> getAll() {
        return service.getAll();
    }

    @GetMapping("/shipment/{shipmentId}")
    public List<AlertRecord> getByShipment(
            @PathVariable Long shipmentId) {
        return service.getByShipmentId(shipmentId);
    }
}
