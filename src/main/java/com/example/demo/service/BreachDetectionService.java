package com.example.demo.service;

import com.example.demo.entity.BreachRecord;
import java.util.List;

public interface BreachDetectionService {

    BreachRecord create(BreachRecord record);

    BreachRecord update(Long id, BreachRecord record);

    List<BreachRecord> getAll();

    List<BreachRecord> getByShipmentId(Long shipmentId);
}
