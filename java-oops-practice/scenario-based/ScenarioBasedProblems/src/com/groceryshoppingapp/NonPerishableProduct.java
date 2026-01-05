package com.groceryshoppingapp;

public class NonPerishableProduct extends Product {

    public NonPerishableProduct(String name, double price, String category) {
        super(name, price, category);
    }

    @Override
    public double getDiscount() {
        return price * 0.05; // 5% discount
    }
}
