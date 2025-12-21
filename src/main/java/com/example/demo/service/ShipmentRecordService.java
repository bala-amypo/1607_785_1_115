package com.example.demo.service;

import com.example.demo.model.ShipmentRecord;
import java.util.List;

public interface ShipmentRecordService {

    ShipmentRecord save(ShipmentRecord record);

    ShipmentRecord findByShipmentCode(String code);

    List<ShipmentRecord> findAll();
}