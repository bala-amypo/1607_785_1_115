package com.example.demo.repository;

import java.util.*;
import com.example.demo.entity.*;
public interface TemperatureRuleRepository {
    TemperatureRule save(TemperatureRule r);
    List<TemperatureRule> findByActiveTrue();
    Optional<TemperatureRule> findApplicableRule(String product, java.time.LocalDate date);
}
