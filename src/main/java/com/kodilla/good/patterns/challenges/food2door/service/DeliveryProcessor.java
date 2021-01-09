package com.kodilla.good.patterns.challenges.food2door.service;

import com.kodilla.good.patterns.challenges.food2door.interfaces.InformationOperator;
import com.kodilla.good.patterns.challenges.food2door.interfaces.OrderRep;

public class DeliveryProcessor {
    private final InformationOperator informationOperator;
    private final OrderRep orderRep;

    public DeliveryProcessor(InformationOperator informationOperator, OrderRep orderRep) {
        this.informationOperator = informationOperator;
        this.orderRep = orderRep;
    }

    public DeliveryDto processor(final DeliveryRequest deliveryRequest){
        boolean orderCreated = deliveryRequest.getSupplier().process(deliveryRequest);
        if (orderCreated){
            informationOperator.inform(deliveryRequest.getOperator(),
                    deliveryRequest.getOrderCreationDate(), deliveryRequest.getOrderDeliveryDate());
            orderRep.createOrder(deliveryRequest.getProduct(), deliveryRequest.getQuantity());
            return new DeliveryDto(deliveryRequest.getOperator(), true);
        } else {
            System.out.println("Failed to create order");
            return new DeliveryDto(deliveryRequest.getOperator(), false);
        }
    }
}
