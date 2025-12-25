package com.example.demo.service.impl;

import com.example.demo.entity.*;
import com.example.demo.repository.*;
import com.example.demo.service.*;
import java.time.LocalDate;
import java.util.*;

public class TemperatureRuleServiceImpl implements TemperatureRuleService {

    private final TemperatureRuleRepository repo;

    public TemperatureRuleServiceImpl(TemperatureRuleRepository repo) {
        this.repo = repo;
    }

    public TemperatureRule createRule(TemperatureRule r) {
        if (r.getMinTemp() > r.getMaxTemp()) {
            throw new IllegalArgumentException();
        }
        return repo.save(r);
    }

    public List<TemperatureRule> getActiveRules() {
        return repo.findByActiveTrue();
    }

    public Optional<TemperatureRule> getRuleForProduct(String product, LocalDate date) {
        return repo.findApplicableRule(product, date);
    }
}
