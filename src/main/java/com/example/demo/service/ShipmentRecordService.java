package com.example.demo.service;

import com.example.demo.entity.ShipmentRecord;
import java.util.List;

public interface ShipmentRecordService {

    ShipmentRecord create(ShipmentRecord record);

    List<ShipmentRecord> getAll();
}
