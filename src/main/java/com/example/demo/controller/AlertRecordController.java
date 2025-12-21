package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import com.example.demo.service.AlertService;

@RestController
@RequestMapping("/api/alerts")
public class AlertRecordController {

    private final AlertService service;

    public AlertRecordController(AlertService service) {
        this.service = service;
    }

    @GetMapping("/{shipmentId}")
    public String alerts(@PathVariable Long shipmentId) {
        return "alerts";
    }
}