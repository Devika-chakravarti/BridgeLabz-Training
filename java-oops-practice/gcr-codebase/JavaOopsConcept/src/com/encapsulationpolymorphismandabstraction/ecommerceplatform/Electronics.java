package com.encapsulationpolymorphismandabstraction.ecommerceplatform;

public class Electronics extends Product implements Taxable {

	// Constructor
    public Electronics(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18;
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Tax applied: 18% (Electronics)");
    }
}
