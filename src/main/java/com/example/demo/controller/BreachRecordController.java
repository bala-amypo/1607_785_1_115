// src/main/java/com/example/demo/controller/BreachRecordController.java
package com.example.demo.controller;

import com.example.demo.entity.BreachRecord;
import com.example.demo.service.BreachDetectionService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Breach Records")
@RestController
@RequestMapping("/api/breaches")
public class BreachRecordController {

    private final BreachDetectionService breachDetectionService;

    public BreachRecordController(BreachDetectionService breachDetectionService) {
        this.breachDetectionService = breachDetectionService;
    }

    @PostMapping
    public ResponseEntity<BreachRecord> logBreach(@RequestBody BreachRecord breach) {
        return ResponseEntity.ok(breachDetectionService.logBreach(breach));
    }

    @PutMapping("/{id}/resolve")
    public ResponseEntity<BreachRecord> resolveBreach(@PathVariable Long id) {
        return ResponseEntity.ok(breachDetectionService.resolveBreach(id));
    }

    @GetMapping("/shipment/{shipmentId}")
    public ResponseEntity<List<BreachRecord>> getBreachesByShipment(@PathVariable Long shipmentId) {
        return ResponseEntity.ok(breachDetectionService.getBreachesByShipment(shipmentId));
    }

    @GetMapping("/{id}")
    public ResponseEntity<BreachRecord> getBreachById(@PathVariable Long id) {
        return ResponseEntity.ok(breachDetectionService.getBreachById(id));
    }

    @GetMapping
    public ResponseEntity<List<BreachRecord>> getAllBreaches() {
        return ResponseEntity.ok(breachDetectionService.getAllBreaches());
    }
}