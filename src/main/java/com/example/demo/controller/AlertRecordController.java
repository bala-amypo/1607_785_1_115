package com.example.demo.controller;

import com.example.demo.entity.AlertRecord;
import com.example.demo.service.AlertService;
import java.util.List;

public class AlertRecordController {

    private final AlertService service;

    public AlertRecordController(AlertService service) {
        this.service = service;
    }

    public AlertRecord triggerAlert(AlertRecord a) {
        return service.triggerAlert(a);
    }

    public List<AlertRecord> getAlertsByShipment(Long shipmentId) {
        return service.getAlertsByShipment(shipmentId);
    }
}
