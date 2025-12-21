package com.example.demo.service.impl;

import com.example.demo.model.ShipmentRecord;
import com.example.demo.repository.ShipmentRecordRepository;
import com.example.demo.service.ShipmentRecordService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipmentRecordServiceImpl implements ShipmentRecordService {

    private final ShipmentRecordRepository repository;

    public ShipmentRecordServiceImpl(ShipmentRecordRepository repository) {
        this.repository = repository;
    }

    @Override
    public ShipmentRecord save(ShipmentRecord record) {
        return repository.save(record);
    }

    @Override
    public ShipmentRecord findByShipmentCode(String code) {
        return repository.findByShipmentCode(code);
    }

    @Override
    public List<ShipmentRecord> findAll() {
        return repository.findAll();
    }
}