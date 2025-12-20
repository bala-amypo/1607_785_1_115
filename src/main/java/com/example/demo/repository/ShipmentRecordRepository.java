package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.ShipmentRecord;
import java.util.Optional;

public interface ShipmentRecordRepository
        extends JpaRepository<ShipmentRecord, Long> {

    Optional<ShipmentRecord> findByShipmentCode(String shipmentCode);
}
