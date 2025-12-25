package com.example.demo.service;

import com.example.demo.entity.BreachRecord;
import java.util.*;

public interface BreachDetectionService {
    BreachRecord logBreach(BreachRecord b);
    BreachRecord resolveBreach(Long id);
    List<BreachRecord> getBreachesByShipment(Long shipmentId);
}
