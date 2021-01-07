package com.kodilla.good.patterns.challenges.order.service;

import java.time.LocalDateTime;

public interface OrderService {
     boolean productInStock(User user, LocalDateTime from, LocalDateTime delivery);
}
