package com.example.demo.service;

import com.example.demo.model.BreachRecord;
import java.util.List;

public interface BreachDetectionService {

    BreachRecord save(BreachRecord record);

    List<BreachRecord> findByShipmentId(Long shipmentId);
}