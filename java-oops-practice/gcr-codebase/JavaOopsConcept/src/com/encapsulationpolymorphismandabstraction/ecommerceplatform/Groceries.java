package com.encapsulationpolymorphismandabstraction.ecommerceplatform;

public class Groceries extends Product {

	// Constructor
    public Groceries(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
}
