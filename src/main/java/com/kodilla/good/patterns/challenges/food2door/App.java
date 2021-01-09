package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.service.*;

public class App {
    public static void main(String[] args){
        DeliveryRequestRetriever deliveryRequestRetriever = new DeliveryRequestRetriever();
        DeliveryRequest deliveryRequest = deliveryRequestRetriever.retrieve();

        DeliveryProcessor deliveryProcessor = new DeliveryProcessor(new MailNotifications(), new DeliveryRep());
        deliveryProcessor.processor(deliveryRequest);
    }
}
