package com.example.demo.controller;

import com.example.demo.entity.TemperatureRule;
import com.example.demo.service.TemperatureRuleService;
import java.time.LocalDate;
import java.util.List;

public class TemperatureRuleController {

    private final TemperatureRuleService service;

    public TemperatureRuleController(TemperatureRuleService service) {
        this.service = service;
    }

    public TemperatureRule createRule(TemperatureRule r) {
        return service.createRule(r);
    }

    public List<TemperatureRule> getActiveRules() {
        return service.getActiveRules();
    }

    public TemperatureRule getRuleForProduct(String product, LocalDate date) {
        return service.getRuleForProduct(product, date).orElse(null);
    }
}
