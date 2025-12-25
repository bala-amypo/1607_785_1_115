package com.example.demo.repository;

import java.util.*;
import com.example.demo.entity.*;
public interface BreachRecordRepository {
    BreachRecord save(BreachRecord b);
    Optional<BreachRecord> findById(Long id);
    List<BreachRecord> findByShipmentId(Long id);
}
