package com.example.demo.repository;

import java.util.*;
import com.example.demo.entity.*;

public interface ShipmentRecordRepository {
    ShipmentRecord save(ShipmentRecord s);
    Optional<ShipmentRecord> findById(Long id);
    Optional<ShipmentRecord> findByShipmentCode(String code);
    List<ShipmentRecord> findAll();
}
