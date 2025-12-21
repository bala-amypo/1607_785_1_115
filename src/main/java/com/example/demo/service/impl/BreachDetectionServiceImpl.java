package com.example.demo.service.impl;

import com.example.demo.model.BreachRecord;
import com.example.demo.repository.BreachRecordRepository;
import com.example.demo.service.BreachDetectionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BreachDetectionServiceImpl implements BreachDetectionService {

    private final BreachRecordRepository repository;

    public BreachDetectionServiceImpl(BreachRecordRepository repository) {
        this.repository = repository;
    }

    @Override
    public BreachRecord save(BreachRecord record) {
        return repository.save(record);
    }

    @Override
    public List<BreachRecord> findByShipmentId(Long shipmentId) {
        return repository.findByShipmentId(shipmentId);
    }
}