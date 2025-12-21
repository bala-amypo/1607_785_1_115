package com.example.demo.service;

import com.example.demo.model.AlertRecord;
import java.util.List;

public interface AlertService {

    AlertRecord save(AlertRecord alert);

    List<AlertRecord> findByShipmentId(Long shipmentId);
}