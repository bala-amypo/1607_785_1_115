package com.example.demo.controller;

import com.example.demo.entity.BreachRecord;
import com.example.demo.service.BreachDetectionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/breaches")
public class BreachRecordController {

    private final BreachDetectionService service;

    public BreachRecordController(BreachDetectionService service) {
        this.service = service;
    }

    @PostMapping
    public BreachRecord create(@RequestBody BreachRecord record) {
        return service.create(record);
    }

    @PutMapping("/{id}")
    public BreachRecord update(
            @PathVariable Long id,
            @RequestBody BreachRecord record) {
        return service.update(id, record);
    }

    @GetMapping
    public List<BreachRecord> getAll() {
        return service.getAll();
    }

    @GetMapping("/shipment/{shipmentId}")
    public List<BreachRecord> getByShipment(
            @PathVariable Long shipmentId) {
        return service.getByShipmentId(shipmentId);
    }
}
