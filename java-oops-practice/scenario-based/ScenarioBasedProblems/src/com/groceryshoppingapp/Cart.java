package com.groceryshoppingapp;

import java.util.ArrayList;

public class Cart implements ICheckout {

    private ArrayList<Product> products;
    private ArrayList<Integer> quantities;
    private double totalPrice;

    public Cart() {
        products = new ArrayList<>();
        quantities = new ArrayList<>();
        totalPrice = 0;
    }

    public void addProduct(Product product, int quantity) {
        products.add(product);
        quantities.add(quantity);
        totalPrice = totalPrice + (product.price * quantity);
    }

    @Override
    public void applyDiscount() {
        double discount = 0;

        for (int i = 0; i < products.size(); i++) {
            int qty = quantities.get(i);

            // Discount only if quantity >= 3
            if (qty >= 3) {
                discount = discount + (products.get(i).getDiscount() * qty);
            }
        }
        totalPrice = totalPrice - discount;
    }

    @Override
    public void generateBill() {

        System.out.println("\n--------------- FINAL BILL ---------------");

        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);
            int qty = quantities.get(i);

            System.out.println(
                p.name + " | ₹" + p.price +
                " | Qty: " + qty +
                " | " + p.category
            );
        }

        System.out.println("------------------------------------------");
        System.out.println("Total Payable: ₹" + totalPrice);
    }
}
