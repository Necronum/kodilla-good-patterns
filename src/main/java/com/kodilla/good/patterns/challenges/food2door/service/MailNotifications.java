package com.kodilla.good.patterns.challenges.food2door.service;

import com.kodilla.good.patterns.challenges.food2door.interfaces.InformationOperator;

import java.time.LocalDateTime;

public class MailNotifications implements InformationOperator {

    @Override
    public void inform(Operator operator, LocalDateTime orderDate, LocalDateTime deliveryDate){
        System.out.println("Mail with order sent by: " + operator.getFirstName() + " " + operator.getLastName()
                + " with date: " + orderDate + ". Delivery date is set to: " + deliveryDate);
    }
}
