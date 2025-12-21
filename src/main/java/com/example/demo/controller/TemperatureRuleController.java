package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import com.example.demo.service.TemperatureRuleService;

@RestController
@RequestMapping("/api/rules")
public class TemperatureRuleController {

    private final TemperatureRuleService service;

    public TemperatureRuleController(TemperatureRuleService service) {
        this.service = service;
    }

    @GetMapping
    public String rules() {
        return "rules";
    }
}