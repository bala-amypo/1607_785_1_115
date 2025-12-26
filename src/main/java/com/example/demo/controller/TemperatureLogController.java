package com.example.demo.controller;

import com.example.demo.entity.TemperatureSensorLog;
import com.example.demo.service.TemperatureLogService;
import java.util.List;

public class TemperatureLogController {

    private final TemperatureLogService service;

    public TemperatureLogController(TemperatureLogService service) {
        this.service = service;
    }

    public TemperatureSensorLog recordLog(TemperatureSensorLog log) {
        return service.recordLog(log);
    }

    public List<TemperatureSensorLog> getLogsByShipment(Long shipmentId) {
        return service.getLogsByShipment(shipmentId);
    }
}
