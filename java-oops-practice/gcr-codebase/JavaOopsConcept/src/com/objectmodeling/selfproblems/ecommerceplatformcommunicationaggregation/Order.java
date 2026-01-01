package com.objectmodeling.selfproblems.ecommerceplatformcommunicationaggregation;
import java.util.ArrayList;

public class Order {

    int orderId;
    ArrayList<Product> products = new ArrayList<>();

    public Order(int orderId) {
        this.orderId = orderId;
    }

    // Add product to order
    public void addProduct(Product product) {
        products.add(product);
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        for (Product p : products) {
            p.showProduct();
        }
    }
}
