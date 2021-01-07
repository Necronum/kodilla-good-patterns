package com.kodilla.good.patterns.challenges.order.service;

import java.time.LocalDateTime;

public interface OrderRepository {
    void createOrder(User user, LocalDateTime from, LocalDateTime delivery);
}
