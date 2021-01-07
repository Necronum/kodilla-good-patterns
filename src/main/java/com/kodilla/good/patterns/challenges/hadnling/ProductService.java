package com.kodilla.good.patterns.challenges.hadnling;

import com.kodilla.good.patterns.challenges.order.service.OrderService;
import com.kodilla.good.patterns.challenges.order.service.User;

import java.time.LocalDateTime;

public class ProductService implements OrderService{
    public boolean productInStock(User user, LocalDateTime from, LocalDateTime delivery){
        System.out.println("Product for: " + user.getFirstName() + " " + user.getLastName() + " order placed at " +
                from +  "is in stock, and will be delivered at " + delivery);
        return true;
    }
}
