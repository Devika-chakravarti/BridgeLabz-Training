package com.sorting.tailorshop;

public class Order {
	protected int orderId;
	protected int deliveryDate;

	public Order(int orderId, int deliveryDate) {
		this.orderId = orderId;
		this.deliveryDate = deliveryDate;
	}

	public void display() {
		System.out.println("Order ID: " + orderId + " | " + "Delivery Date: " + deliveryDate);
	}
}
