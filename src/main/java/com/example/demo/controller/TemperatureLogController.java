// src/main/java/com/example/demo/controller/TemperatureLogController.java
package com.example.demo.controller;

import com.example.demo.entity.TemperatureSensorLog;
import com.example.demo.service.TemperatureLogService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Temperature Logs")
@RestController
@RequestMapping("/api/logs")
public class TemperatureLogController {

    private final TemperatureLogService temperatureLogService;

    public TemperatureLogController(TemperatureLogService temperatureLogService) {
        this.temperatureLogService = temperatureLogService;
    }

    @PostMapping
    public ResponseEntity<TemperatureSensorLog> recordLog(@RequestBody TemperatureSensorLog log) {
        return ResponseEntity.ok(temperatureLogService.recordLog(log));
    }

    @GetMapping("/shipment/{shipmentId}")
    public ResponseEntity<List<TemperatureSensorLog>> getLogsByShipment(@PathVariable Long shipmentId) {
        return ResponseEntity.ok(temperatureLogService.getLogsByShipment(shipmentId));
    }

    @GetMapping("/{id}")
    public ResponseEntity<TemperatureSensorLog> getLogById(@PathVariable Long id) {
        return ResponseEntity.ok(temperatureLogService.getLogById(id));
    }

    @GetMapping
    public ResponseEntity<List<TemperatureSensorLog>> getAllLogs() {
        return ResponseEntity.ok(temperatureLogService.getAllLogs());
    }
}