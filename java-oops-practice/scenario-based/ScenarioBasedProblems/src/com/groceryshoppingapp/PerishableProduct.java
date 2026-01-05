package com.groceryshoppingapp;

public class PerishableProduct extends Product {

    public PerishableProduct(String name, double price, String category) {
        super(name, price, category);
    }

    @Override
    public double getDiscount() {
        return price * 0.10; // 10% discount
    }
}
