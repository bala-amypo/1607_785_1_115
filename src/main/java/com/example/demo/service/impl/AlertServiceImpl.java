package com.example.demo.service.impl;

import com.example.demo.entity.AlertRecord;
import com.example.demo.repository.AlertRecordRepository;
import com.example.demo.service.AlertService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlertServiceImpl implements AlertService {

    private final AlertRecordRepository repo;

    public AlertServiceImpl(AlertRecordRepository repo) {
        this.repo = repo;
    }

    @Override
    public AlertRecord create(AlertRecord record) {
        return repo.save(record);
    }

    @Override
    public AlertRecord update(Long id, AlertRecord record) {
        record.setId(id);
        return repo.save(record);
    }

    @Override
    public List<AlertRecord> getAll() {
        return repo.findAll();
    }

    @Override
    public List<AlertRecord> getByShipmentId(Long shipmentId) {
        return repo.findByShipmentId(shipmentId);
    }
}
