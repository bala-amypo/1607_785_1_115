package com.example.demo.controller;

import com.example.demo.entity.ShipmentRecord;
import com.example.demo.service.ShipmentRecordService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shipments")
public class ShipmentRecordController {

    private final ShipmentRecordService service;

    public ShipmentRecordController(ShipmentRecordService service) {
        this.service = service;
    }

    @PostMapping
    public ShipmentRecord create(@RequestBody ShipmentRecord shipment) {
        return service.createShipment(shipment);
    }

    @PutMapping("/{id}/status")
    public ShipmentRecord updateStatus(@PathVariable Long id,
                                       @RequestParam String status) {
        return service.updateStatus(id, status);
    }
}