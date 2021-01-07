package com.kodilla.good.patterns.challenges.hadnling;

import com.kodilla.good.patterns.challenges.order.service.OrderRepository;
import com.kodilla.good.patterns.challenges.order.service.User;

import java.time.LocalDateTime;

public class ProductRepository implements OrderRepository {
    public void createOrder(User user, LocalDateTime from, LocalDateTime delivery){
        System.out.println("Created order for: " + user.getFirstName() + " " + user.getLastName());
    }
}
