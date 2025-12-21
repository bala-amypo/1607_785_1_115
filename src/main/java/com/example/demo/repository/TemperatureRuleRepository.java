package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.TemperatureRule;
import org.springframework.data.jpa.repository.Query;
import java.time.LocalDate;
import java.util.List;

public interface TemperatureRuleRepository extends JpaRepository<TemperatureRule, Long> {

    List<TemperatureRule> findByActiveTrue();

    @Query("SELECT t FROM TemperatureRule t WHERE t.productType = :productType AND :date BETWEEN t.effectiveFrom AND t.effectiveTo")
    TemperatureRule findApplicableRule(String productType, LocalDate date);
}