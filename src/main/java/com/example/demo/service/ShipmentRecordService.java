package com.example.demo.service;

import com.example.demo.entity.ShipmentRecord;

public interface ShipmentRecordService {
    ShipmentRecord createShipment(ShipmentRecord shipment);
    ShipmentRecord updateStatus(Long id, String status);
}