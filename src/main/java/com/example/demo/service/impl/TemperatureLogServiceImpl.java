package com.example.demo.service.impl;

import com.example.demo.model.TemperatureSensorLog;
import com.example.demo.repository.TemperatureSensorLogRepository;
import com.example.demo.service.TemperatureLogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemperatureLogServiceImpl implements TemperatureLogService {

    private final TemperatureSensorLogRepository repository;

    public TemperatureLogServiceImpl(TemperatureSensorLogRepository repository) {
        this.repository = repository;
    }

    @Override
    public TemperatureSensorLog save(TemperatureSensorLog log) {
        return repository.save(log);
    }

    @Override
    public List<TemperatureSensorLog> findByShipmentId(Long shipmentId) {
        return repository.findByShipmentId(shipmentId);
    }
}