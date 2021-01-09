package com.kodilla.good.patterns.challenges.food2door.suppliers;

import com.kodilla.good.patterns.challenges.food2door.interfaces.Supplier;
import com.kodilla.good.patterns.challenges.food2door.service.DeliveryRequest;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements Supplier {
    private static final String SUPPLIER_NAME = "Extra Food Shop";
    private final Map<String, Integer> products = new HashMap<>();


    public ExtraFoodShop() {
        products.put("Bacon", 1000);
        products.put("Broccoli", 200);
        products.put("Mustard", 500);
        products.put("Sausage", 350);
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
        } else {
            return true;
        }
    }

    @Override
    public String getSupplierName(){
        return SUPPLIER_NAME;
    }
}
