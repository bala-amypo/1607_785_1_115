package com.example.demo.service.impl;

import com.example.demo.entity.ShipmentRecord;
import com.example.demo.repository.ShipmentRecordRepository;
import com.example.demo.service.ShipmentRecordService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipmentRecordServiceImpl implements ShipmentRecordService {

    private final ShipmentRecordRepository repo;

    public ShipmentRecordServiceImpl(ShipmentRecordRepository repo) {
        this.repo = repo;
    }

    @Override
    public ShipmentRecord create(ShipmentRecord record) {
        return repo.save(record);
    }

    @Override
    public List<ShipmentRecord> getAll() {
        return repo.findAll();
    }
}
