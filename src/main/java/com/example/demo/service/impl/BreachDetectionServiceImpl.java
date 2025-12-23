package com.example.demo.service.impl;

import com.example.demo.entity.BreachRecord;
import com.example.demo.repository.BreachRecordRepository;
import com.example.demo.service.BreachDetectionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BreachDetectionServiceImpl implements BreachDetectionService {

    private final BreachRecordRepository repo;

    public BreachDetectionServiceImpl(BreachRecordRepository repo) {
        this.repo = repo;
    }

    @Override
    public BreachRecord create(BreachRecord record) {
        return repo.save(record);
    }

    @Override
    public BreachRecord update(Long id, BreachRecord record) {
        record.setId(id);
        return repo.save(record);
    }

    @Override
    public List<BreachRecord> getAll() {
        return repo.findAll();
    }

    @Override
    public List<BreachRecord> getByShipmentId(Long shipmentId) {
        return repo.findByShipmentId(shipmentId);
    }
}
