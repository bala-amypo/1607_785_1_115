package com.example.demo.service;

import com.example.demo.entity.TemperatureRule;
import java.time.LocalDate;
import java.util.*;

public interface TemperatureRuleService {
    TemperatureRule createRule(TemperatureRule r);
    List<TemperatureRule> getActiveRules();
    Optional<TemperatureRule> getRuleForProduct(String product, LocalDate date);
}
