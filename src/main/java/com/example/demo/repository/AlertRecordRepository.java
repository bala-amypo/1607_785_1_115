package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.AlertRecord;
import java.util.List;

public interface AlertRecordRepository extends JpaRepository<AlertRecord, Long> {

    List<AlertRecord> findByShipmentId(Long shipmentId);
}