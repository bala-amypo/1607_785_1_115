package com.example.demo.controller;

import com.example.demo.entity.TemperatureSensorLog;
import com.example.demo.service.TemperatureLogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/temperature-logs")
public class TemperatureLogController {

    private final TemperatureLogService service;

    public TemperatureLogController(TemperatureLogService service) {
        this.service = service;
    }

    @PostMapping
    public TemperatureSensorLog create(@RequestBody TemperatureSensorLog log) {
        return service.save(log);
    }

    @GetMapping("/{shipmentId}")
    public List<TemperatureSensorLog> getByShipment(
            @PathVariable Long shipmentId) {
        return service.getByShipmentId(shipmentId);
    }
}
