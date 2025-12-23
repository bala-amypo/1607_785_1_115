package com.example.demo.service;

import com.example.demo.entity.TemperatureSensorLog;
import java.util.List;

public interface TemperatureLogService {

    TemperatureSensorLog save(TemperatureSensorLog log);

    List<TemperatureSensorLog> getByShipmentId(Long shipmentId);
}
