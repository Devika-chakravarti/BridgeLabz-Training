package com.objectmodeling.selfproblems.ecommerceplatformcommunicationaggregation;

public class UseEcommercePlatform {
	public static void main(String[] args) {

        // Create customer
        Customer customer = new Customer("Rahul");

        // Create products
        Product p1 = new Product("Laptop", 60000);
        Product p2 = new Product("Mouse", 800);
        Product p3 = new Product("Keyboard", 1500);

        // Create order
        Order order1 = new Order(101);

        // Add products to order
        order1.addProduct(p1);
        order1.addProduct(p2);
        order1.addProduct(p3);

        // Customer places order
        customer.placeOrder(order1);

        // Show order details
        customer.showOrders();
    }
}
