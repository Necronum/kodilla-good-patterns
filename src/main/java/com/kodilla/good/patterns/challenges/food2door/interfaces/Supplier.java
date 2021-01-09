package com.kodilla.good.patterns.challenges.food2door.interfaces;

import com.kodilla.good.patterns.challenges.food2door.service.DeliveryRequest;

import java.util.Map;

public interface Supplier {
    boolean process(DeliveryRequest deliveryRequest);
    String getSupplierName();
}
