package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.BreachRecord;
import java.util.List;

public interface BreachRecordRepository
        extends JpaRepository<BreachRecord, Long> {

    List<BreachRecord> findByShipmentId(Long shipmentId);
}
