package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import com.example.demo.service.ShipmentRecordService;

@RestController
@RequestMapping("/api/shipments")
public class ShipmentRecordController {

    private final ShipmentRecordService service;

    public ShipmentRecordController(ShipmentRecordService service) {
        this.service = service;
    }

    @GetMapping
    public String getAll() {
        return "shipments";
    }
}