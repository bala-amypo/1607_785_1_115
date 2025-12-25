package com.example.demo.repository;

import java.util.*;
import com.example.demo.entity.*;
public interface TemperatureSensorLogRepository {
    TemperatureSensorLog save(TemperatureSensorLog l);
    List<TemperatureSensorLog> findByShipmentId(Long id);
}
