package com.kodilla.good.patterns.challenges.food2door.suppliers;

import com.kodilla.good.patterns.challenges.food2door.interfaces.Supplier;
import com.kodilla.good.patterns.challenges.food2door.service.DeliveryRequest;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements Supplier {
    private static final String SUPPLIER_NAME = "Gluten Free Shop";
    private final Map<String, Integer> products = new HashMap<>();

    public GlutenFreeShop() {
        products.put("Vegan Soy Paste", 2000);
        products.put("Vegan Bacon", 900);
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
        } else if(deliveryRequest.getQuantity() < 500){
            System.out.println("Minimal order quantity is 500!");
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
