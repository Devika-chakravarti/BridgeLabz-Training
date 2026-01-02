package com.encapsulationpolymorphismandabstraction.ecommerceplatform;

import java.util.ArrayList;

public class UseEcommercePlatform {

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Electronics("P101", "Laptop", 60000));
        products.add(new Clothing("P102", "Jacket", 3000));
        products.add(new Groceries("P103", "Cashew", 1200));

        for (int i = 0; i < products.size(); i++) {

            Product product = products.get(i);

            product.displayProduct();

            double discount = product.calculateDiscount();
            double tax = product.calculateTax();
            double finalPrice = product.getPrice() + tax - discount;

            product.getTaxDetails();

            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("----------------------------------");
        }
    }
}
