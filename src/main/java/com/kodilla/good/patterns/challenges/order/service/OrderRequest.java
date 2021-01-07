package com.kodilla.good.patterns.challenges.order.service;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private LocalDateTime from;
    private LocalDateTime delivery;

    public OrderRequest(final User user, final LocalDateTime from, final LocalDateTime delivery) {
        this.user = user;
        this.from = from;
        this.delivery = delivery;
    }

    public User getUser() { return user; }

    public LocalDateTime getFrom() { return from; }

    public LocalDateTime getDelivery() { return delivery; }
}
