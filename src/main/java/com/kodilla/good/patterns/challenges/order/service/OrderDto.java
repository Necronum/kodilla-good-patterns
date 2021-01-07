package com.kodilla.good.patterns.challenges.order.service;

public class OrderDto {
    public User user;
    public boolean orderCreated;

    public OrderDto(final User user, final boolean orderCreated) {
        this.user = user;
        this.orderCreated = orderCreated;
    }

    public User getUser() {
        return user;
    }

    public boolean isOrderCreated() {
        return orderCreated;
    }
}
