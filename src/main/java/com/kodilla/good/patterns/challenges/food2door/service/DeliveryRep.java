package com.kodilla.good.patterns.challenges.food2door.service;

import com.kodilla.good.patterns.challenges.food2door.interfaces.OrderRep;
import com.kodilla.good.patterns.challenges.order.service.User;

import java.time.LocalDateTime;

public class DeliveryRep implements OrderRep {
    @Override
    public void createOrder(String product, int quantity) {
        System.out.println("Order created for: " + product + " in quantity: " + quantity);
    }
}
