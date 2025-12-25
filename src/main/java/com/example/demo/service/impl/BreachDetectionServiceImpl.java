package com.example.demo.service.impl;

import com.example.demo.entity.*;
import com.example.demo.repository.*;
import com.example.demo.service.*;
import java.util.*;

public class BreachDetectionServiceImpl implements BreachDetectionService {

    private final BreachRecordRepository repo;

    public BreachDetectionServiceImpl(BreachRecordRepository repo) {
        this.repo = repo;
    }

    public BreachRecord logBreach(BreachRecord b) {
        return repo.save(b);
    }

    public BreachRecord resolveBreach(Long id) {
        BreachRecord b = repo.findById(id).orElseThrow();
        b.setResolved(true);
        return repo.save(b);
    }

    public List<BreachRecord> getBreachesByShipment(Long id) {
        return repo.findByShipmentId(id);
    }
}
