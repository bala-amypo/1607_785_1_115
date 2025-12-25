// src/main/java/com/example/demo/controller/ShipmentRecordController.java
package com.example.demo.controller;

import com.example.demo.entity.ShipmentRecord;
import com.example.demo.service.ShipmentRecordService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Tag(name = "Shipments")
@RestController
@RequestMapping("/api/shipments")
public class ShipmentRecordController {

    private final ShipmentRecordService shipmentRecordService;

    public ShipmentRecordController(ShipmentRecordService shipmentRecordService) {
        this.shipmentRecordService = shipmentRecordService;
    }

    @PostMapping
    public ResponseEntity<ShipmentRecord> createShipment(@RequestBody ShipmentRecord shipment) {
        return ResponseEntity.ok(shipmentRecordService.createShipment(shipment));
    }

    @PutMapping("/{id}/status")
    public ResponseEntity<ShipmentRecord> updateShipmentStatus(@PathVariable Long id, @RequestBody String status) {
        return ResponseEntity.ok(shipmentRecordService.updateShipmentStatus(id, status));
    }

    @GetMapping("/code/{shipmentCode}")
    public ResponseEntity<Optional<ShipmentRecord>> getShipmentByCode(@PathVariable String shipmentCode) {
        return ResponseEntity.ok(shipmentRecordService.getShipmentByCode(shipmentCode));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ShipmentRecord> getShipmentById(@PathVariable Long id) {
        return ResponseEntity.ok(shipmentRecordService.getShipmentById(id));
    }

    @GetMapping
    public ResponseEntity<List<ShipmentRecord>> getAllShipments() {
        return ResponseEntity.ok(shipmentRecordService.getAllShipments());
    }
}