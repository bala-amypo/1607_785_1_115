package com.example.demo.service.impl;

import com.example.demo.entity.*;
import com.example.demo.repository.*;
import com.example.demo.service.*;
import java.util.*;

public class AlertServiceImpl implements AlertService {

    private final AlertRecordRepository repo;

    public AlertServiceImpl(AlertRecordRepository repo) {
        this.repo = repo;
    }

    public AlertRecord triggerAlert(AlertRecord a) {
        return repo.save(a);
    }

    public List<AlertRecord> getAlertsByShipment(Long id) {
        return repo.findByShipmentId(id);
    }
}
