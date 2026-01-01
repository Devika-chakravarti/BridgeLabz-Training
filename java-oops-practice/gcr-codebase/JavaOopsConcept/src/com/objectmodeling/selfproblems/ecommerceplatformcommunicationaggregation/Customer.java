package com.objectmodeling.selfproblems.ecommerceplatformcommunicationaggregation;
import java.util.ArrayList;

public class Customer {

    String name;
    ArrayList<Order> orders = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    // Customer places an order
    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed Order ID: " + order.orderId);
    }

    public void showOrders() {
        System.out.println("Orders placed by " + name + ":");
        for (Order order : orders) {
            order.showOrderDetails();
        }
    }
}
