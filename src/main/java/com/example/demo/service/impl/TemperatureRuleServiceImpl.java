package com.example.demo.service.impl;

import com.example.demo.entity.TemperatureRule;
import com.example.demo.repository.TemperatureRuleRepository;
import com.example.demo.service.TemperatureRuleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemperatureRuleServiceImpl implements TemperatureRuleService {

    private final TemperatureRuleRepository repo;

    public TemperatureRuleServiceImpl(TemperatureRuleRepository repo) {
        this.repo = repo;
    }

    @Override
    public TemperatureRule create(TemperatureRule rule) {
        return repo.save(rule);
    }

    @Override
    public TemperatureRule update(Long id, TemperatureRule rule) {
        rule.setId(id);
        return repo.save(rule);
    }

    @Override
    public List<TemperatureRule> getAll() {
        return repo.findAll();
    }
}
