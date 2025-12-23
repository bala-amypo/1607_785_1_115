package com.example.demo.controller;

import com.example.demo.entity.TemperatureRule;
import com.example.demo.service.TemperatureRuleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/temperature-rules")
public class TemperatureRuleController {

    private final TemperatureRuleService service;

    public TemperatureRuleController(TemperatureRuleService service) {
        this.service = service;
    }

    @PostMapping
    public TemperatureRule create(@RequestBody TemperatureRule rule) {
        return service.create(rule);
    }

    @PutMapping("/{id}")
    public TemperatureRule update(
            @PathVariable Long id,
            @RequestBody TemperatureRule rule) {
        return service.update(id, rule);
    }

    @GetMapping
    public List<TemperatureRule> getAll() {
        return service.getAll();
    }
}
