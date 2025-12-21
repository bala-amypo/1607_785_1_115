package com.example.demo.service;

import com.example.demo.model.TemperatureSensorLog;
import java.util.List;

public interface TemperatureLogService {

    TemperatureSensorLog save(TemperatureSensorLog log);

    List<TemperatureSensorLog> findByShipmentId(Long shipmentId);
}