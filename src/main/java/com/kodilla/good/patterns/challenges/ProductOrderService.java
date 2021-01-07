package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.order.service.*;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService,
                               final OrderService orderService,
                               final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest){
        boolean isOrderCreated = orderService.productInStock(orderRequest.getUser(), orderRequest.getFrom(), orderRequest.getDelivery());
        if(isOrderCreated){
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getFrom(), orderRequest.getDelivery());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}

