package com.example.demo.service;

import com.example.demo.model.TemperatureRule;
import java.time.LocalDate;
import java.util.List;

public interface TemperatureRuleService {

    TemperatureRule save(TemperatureRule rule);

    List<TemperatureRule> findActiveRules();

    TemperatureRule findApplicableRule(String productType, LocalDate date);
}