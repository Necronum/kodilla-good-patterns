package com.kodilla.good.patterns.challenges.food2door.service;

public class DeliveryDto {
    public Operator operator;
    public boolean orderCreated;

    public DeliveryDto(final Operator operator, final boolean orderCreated) {
        this.operator = operator;
        this.orderCreated = orderCreated;
    }

    public Operator getOperator() {
        return operator;
    }

    public boolean isOrderCreated() {
        return orderCreated;
    }
}
