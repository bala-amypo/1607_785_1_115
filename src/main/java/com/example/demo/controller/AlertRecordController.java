// src/main/java/com/example/demo/controller/AlertRecordController.java
package com.example.demo.controller;

import com.example.demo.entity.AlertRecord;
import com.example.demo.service.AlertService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Alerts")
@RestController
@RequestMapping("/api/alerts")
public class AlertRecordController {

    private final AlertService alertService;

    public AlertRecordController(AlertService alertService) {
        this.alertService = alertService;
    }

    @PostMapping
    public ResponseEntity<AlertRecord> triggerAlert(@RequestBody AlertRecord alert) {
        return ResponseEntity.ok(alertService.triggerAlert(alert));
    }

    @PutMapping("/{id}/acknowledge")
    public ResponseEntity<AlertRecord> acknowledgeAlert(@PathVariable Long id) {
        return ResponseEntity.ok(alertService.acknowledgeAlert(id));
    }

    @GetMapping("/shipment/{shipmentId}")
    public ResponseEntity<List<AlertRecord>> getAlertsByShipment(@PathVariable Long shipmentId) {
        return ResponseEntity.ok(alertService.getAlertsByShipment(shipmentId));
    }

    @GetMapping("/{id}")
    public ResponseEntity<AlertRecord> getAlertById(@PathVariable Long id) {
        return ResponseEntity.ok(alertService.getAlertById(id));
    }

    @GetMapping
    public ResponseEntity<List<AlertRecord>> getAllAlerts() {
        return ResponseEntity.ok(alertService.getAllAlerts());
    }
}