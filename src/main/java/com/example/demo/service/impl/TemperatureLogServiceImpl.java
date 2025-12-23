package com.example.demo.service.impl;

import com.example.demo.entity.TemperatureSensorLog;
import com.example.demo.repository.TemperatureSensorLogRepository;
import com.example.demo.service.TemperatureLogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemperatureLogServiceImpl implements TemperatureLogService {

    private final TemperatureSensorLogRepository repo;

    public TemperatureLogServiceImpl(TemperatureSensorLogRepository repo) {
        this.repo = repo;
    }

    @Override
    public TemperatureSensorLog save(TemperatureSensorLog log) {
        return repo.save(log);
    }

    @Override
    public List<TemperatureSensorLog> getByShipmentId(Long shipmentId) {
        return repo.findByShipmentId(shipmentId);
    }
}
