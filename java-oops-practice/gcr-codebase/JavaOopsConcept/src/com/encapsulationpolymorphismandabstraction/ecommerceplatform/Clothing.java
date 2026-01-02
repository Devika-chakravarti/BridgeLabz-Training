package com.encapsulationpolymorphismandabstraction.ecommerceplatform;

public class Clothing extends Product implements Taxable {

	// Constructor
    public Clothing(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.12;
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Tax applied: 12% (Clothing)");
    }
}
