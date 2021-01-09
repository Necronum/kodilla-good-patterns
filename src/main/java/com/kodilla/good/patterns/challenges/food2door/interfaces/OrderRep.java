package com.kodilla.good.patterns.challenges.food2door.interfaces;

import com.kodilla.good.patterns.challenges.order.service.User;

import java.time.LocalDateTime;

public interface OrderRep {
    void createOrder(String product, int quantity);
}
