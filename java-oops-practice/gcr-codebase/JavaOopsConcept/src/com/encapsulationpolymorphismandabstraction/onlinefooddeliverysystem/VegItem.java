package com.encapsulationpolymorphismandabstraction.onlinefooddeliverysystem;

public class VegItem extends FoodItem implements Discountable {

	// Constructor
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double applyDiscount() {
        return getPrice() * getQuantity() * 0.05;
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) - applyDiscount();
    }

    @Override
    public String getDiscountDetails() {
        return "5% discount applied on veg item";
    }
}
