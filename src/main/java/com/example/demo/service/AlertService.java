package com.example.demo.service;

import com.example.demo.entity.AlertRecord;
import java.util.List;

public interface AlertService {

    AlertRecord create(AlertRecord record);

    AlertRecord update(Long id, AlertRecord record);

    List<AlertRecord> getAll();

    List<AlertRecord> getByShipmentId(Long shipmentId);
}
