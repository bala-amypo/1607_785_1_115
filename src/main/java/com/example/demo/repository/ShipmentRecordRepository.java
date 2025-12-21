package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.ShipmentRecord;

public interface ShipmentRecordRepository extends JpaRepository<ShipmentRecord, Long> {

    ShipmentRecord findByShipmentCode(String code);
}