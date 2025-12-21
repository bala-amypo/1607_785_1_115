package com.example.demo.service.impl;

import com.example.demo.model.TemperatureRule;
import com.example.demo.repository.TemperatureRuleRepository;
import com.example.demo.service.TemperatureRuleService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TemperatureRuleServiceImpl implements TemperatureRuleService {

    private final TemperatureRuleRepository repository;

    public TemperatureRuleServiceImpl(TemperatureRuleRepository repository) {
        this.repository = repository;
    }

    @Override
    public TemperatureRule save(TemperatureRule rule) {
        return repository.save(rule);
    }

    @Override
    public List<TemperatureRule> findActiveRules() {
        return repository.findByActiveTrue();
    }

    @Override
    public TemperatureRule findApplicableRule(String productType, LocalDate date) {
        return repository.findApplicableRule(productType, date);
    }
}