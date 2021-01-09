package com.kodilla.good.patterns.challenges.food2door.suppliers;

import com.kodilla.good.patterns.challenges.food2door.interfaces.Supplier;
import com.kodilla.good.patterns.challenges.food2door.service.DeliveryRequest;

import java.util.HashMap;
import java.util.Map;
import java.time.temporal.ChronoUnit;

public class HealthyShop implements Supplier {
    private static final String SUPPLIER_NAME = "Healthy Shop";
    private final Map<String, Integer> products = new HashMap<>();

    public HealthyShop() {
        products.put("Tomato", 150);
        products.put("Vegan Soy Paste", 2000);
        products.put("Veggie mix", 900);
    }

    public Map<String, Integer> getProducts() {
        return products;
    }

    @Override
    public boolean process(DeliveryRequest deliveryRequest){
        if (!products.containsKey(deliveryRequest.getProduct())){
            System.out.println("Product not available in the offer.");
            return false;
        } else if(deliveryRequest.getQuantity() > products.get(deliveryRequest.getProduct())) {
            System.out.println("Not enough product in stock.");
            return false;
        } else if(ChronoUnit.DAYS.between(deliveryRequest.getOrderCreationDate(), deliveryRequest.getOrderDeliveryDate()) < 6){
            System.out.println("Delivery date must be at least 7 days from order creation date");
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String getSupplierName(){
        return SUPPLIER_NAME;
    }
}
