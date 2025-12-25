package com.example.demo.service;

import com.example.demo.entity.AlertRecord;
import java.util.*;

public interface AlertService {
    AlertRecord triggerAlert(AlertRecord a);
    List<AlertRecord> getAlertsByShipment(Long shipmentId);
}
