package com.encapsulationpolymorphismandabstraction.onlinefooddeliverysystem;

public class NonVegItem extends FoodItem implements Discountable {

    private final double extraCharge = 50;

    // Constructor
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double applyDiscount() {
        return getPrice() * getQuantity() * 0.03;
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + extraCharge - applyDiscount();
    }

    @Override
    public String getDiscountDetails() {
        return "3% discount with additional non-veg charge";
    }
}
