package com.example.demo.repository;

import java.util.*;
import com.example.demo.entity.*;
public interface AlertRecordRepository {
    AlertRecord save(AlertRecord a);
    List<AlertRecord> findByShipmentId(Long id);
}
