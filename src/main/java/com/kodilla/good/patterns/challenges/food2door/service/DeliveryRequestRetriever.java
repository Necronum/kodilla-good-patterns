package com.kodilla.good.patterns.challenges.food2door.service;

import com.kodilla.good.patterns.challenges.food2door.interfaces.Supplier;
import com.kodilla.good.patterns.challenges.food2door.suppliers.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.food2door.suppliers.HealthyShop;

import java.time.LocalDateTime;

public class DeliveryRequestRetriever {
    public DeliveryRequest retrieve(){
        Operator operator = new Operator("Marcin" , "Koc");
        Supplier supplier = new HealthyShop();
        LocalDateTime orderCreated = LocalDateTime.now();
        LocalDateTime orderDeliveryDate = LocalDateTime.of(2021, 1, 14, 12, 30);
        String product = "Tomato";
        int quantity = 50;

        return new DeliveryRequest(operator, supplier, orderCreated, orderDeliveryDate, product, quantity);
    }
}
