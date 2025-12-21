package com.example.demo.service.impl;

import com.example.demo.model.AlertRecord;
import com.example.demo.repository.AlertRecordRepository;
import com.example.demo.service.AlertService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlertServiceImpl implements AlertService {

    private final AlertRecordRepository repository;

    public AlertServiceImpl(AlertRecordRepository repository) {
        this.repository = repository;
    }

    @Override
    public AlertRecord save(AlertRecord alert) {
        return repository.save(alert);
    }

    @Override
    public List<AlertRecord> findByShipmentId(Long shipmentId) {
        return repository.findByShipmentId(shipmentId);
    }
}