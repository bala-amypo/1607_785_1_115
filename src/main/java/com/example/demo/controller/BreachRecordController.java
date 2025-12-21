package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import com.example.demo.service.BreachDetectionService;

@RestController
@RequestMapping("/api/breaches")
public class BreachRecordController {

    private final BreachDetectionService service;

    public BreachRecordController(BreachDetectionService service) {
        this.service = service;
    }

    @GetMapping("/{shipmentId}")
    public String breaches(@PathVariable Long shipmentId) {
        return "breaches";
    }
}