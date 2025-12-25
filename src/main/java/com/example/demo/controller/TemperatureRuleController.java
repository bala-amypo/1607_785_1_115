// src/main/java/com/example/demo/controller/TemperatureRuleController.java
package com.example.demo.controller;

import com.example.demo.entity.TemperatureRule;
import com.example.demo.service.TemperatureRuleService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Tag(name = "Temperature Rules")
@RestController
@RequestMapping("/api/rules")
public class TemperatureRuleController {

    private final TemperatureRuleService temperatureRuleService;

    public TemperatureRuleController(TemperatureRuleService temperatureRuleService) {
        this.temperatureRuleService = temperatureRuleService;
    }

    @PostMapping
    public ResponseEntity<TemperatureRule> createRule(@RequestBody TemperatureRule rule) {
        return ResponseEntity.ok(temperatureRuleService.createRule(rule));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TemperatureRule> updateRule(@PathVariable Long id, @RequestBody TemperatureRule rule) {
        return ResponseEntity.ok(temperatureRuleService.updateRule(id, rule));
    }

    @GetMapping("/active")
    public ResponseEntity<List<TemperatureRule>> getActiveRules() {
        return ResponseEntity.ok(temperatureRuleService.getActiveRules());
    }

    @GetMapping("/product/{productType}")
    public ResponseEntity<Optional<TemperatureRule>> getRuleForProduct(@PathVariable String productType, @RequestParam(required = false) LocalDate date) {
        if (date == null) {
            date = LocalDate.now();
        }
        return ResponseEntity.ok(temperatureRuleService.getRuleForProduct(productType, date));
    }

    @GetMapping
    public ResponseEntity<List<TemperatureRule>> getAllRules() {
        return ResponseEntity.ok(temperatureRuleService.getAllRules());
    }
}