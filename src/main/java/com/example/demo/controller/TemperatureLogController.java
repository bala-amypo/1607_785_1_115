package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import com.example.demo.service.TemperatureLogService;

@RestController
@RequestMapping("/api/logs")
public class TemperatureLogController {

    private final TemperatureLogService service;

    public TemperatureLogController(TemperatureLogService service) {
        this.service = service;
    }

    @GetMapping("/{shipmentId}")
    public String logs(@PathVariable Long shipmentId) {
        return "logs";
    }
}