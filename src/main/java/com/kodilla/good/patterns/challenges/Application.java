package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.hadnling.MailService;
import com.kodilla.good.patterns.challenges.order.service.OrderRequest;
import com.kodilla.good.patterns.challenges.order.service.OrderRequestRetriever;
import com.kodilla.good.patterns.challenges.hadnling.ProductRepository;
import com.kodilla.good.patterns.challenges.hadnling.ProductService;

public class Application {
    public static void main(String[] args){
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new MailService(),
                new ProductService(), new ProductRepository());
        productOrderService.process(orderRequest);
    }
}
