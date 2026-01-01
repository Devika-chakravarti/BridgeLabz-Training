package com.inheritance.multilevelinheritance.onlineretailordermanagement;

public class UseOnlineRetailOrderManagement {
	public static void main(String[] args) {

        Order order = new Order(101, "2024-01-10");
        ShippedOrder shipped = new ShippedOrder(102, "2024-01-11", "TRK123");
        DeliveredOrder delivered = new DeliveredOrder(103, "2024-01-12", "TRK456", "2024-01-15");

        System.out.println(order.getOrderStatus());
        System.out.println(shipped.getOrderStatus());
        System.out.println(delivered.getOrderStatus());
    }
}
