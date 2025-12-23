package com.example.demo.service;

import com.example.demo.entity.TemperatureRule;
import java.util.List;

public interface TemperatureRuleService {

    TemperatureRule create(TemperatureRule rule);

    TemperatureRule update(Long id, TemperatureRule rule);

    List<TemperatureRule> getAll();
}
