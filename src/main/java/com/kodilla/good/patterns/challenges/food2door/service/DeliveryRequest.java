package com.kodilla.good.patterns.challenges.food2door.service;

import com.kodilla.good.patterns.challenges.food2door.interfaces.Supplier;

import java.time.LocalDateTime;

public class DeliveryRequest {
    private final Operator operator;
    private final Supplier supplier;
    private final LocalDateTime orderCreationDate;
    private final LocalDateTime orderDeliveryDate;
    private final String product;
    private final int quantity;

    public DeliveryRequest(Operator operator, Supplier supplier, LocalDateTime orderCreationDate, LocalDateTime orderDeliveryDate, String product, int quantity) {
        this.operator = operator;
        this.supplier = supplier;
        this.orderCreationDate = orderCreationDate;
        this.orderDeliveryDate = orderDeliveryDate;
        this.product = product;
        this.quantity = quantity;
    }

    public Operator getOperator() {
        return operator;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public LocalDateTime getOrderCreationDate() {
        return orderCreationDate;
    }

    public LocalDateTime getOrderDeliveryDate() {
        return orderDeliveryDate;
    }

    public String getProduct() {
        return product;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
