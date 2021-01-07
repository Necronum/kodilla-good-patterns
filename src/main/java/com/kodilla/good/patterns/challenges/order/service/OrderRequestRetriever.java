package com.kodilla.good.patterns.challenges.order.service;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("John", "Wekl");

        LocalDateTime orderFrom = LocalDateTime.now();
        LocalDateTime orderDelivery = LocalDateTime.of(2021,1,20, 12, 0);

        return new OrderRequest(user, orderFrom, orderDelivery);
    }
}
