package com.foodloop;

import java.util.ArrayList;

public class Order implements IOrderable {

	private ArrayList<FoodItem> items;
	private double totalPrice;
	private double finalAmount;

	public Order() {
		items = new ArrayList<>();
		totalPrice = 0;
		finalAmount = 0;
	}

	public void addItem(FoodItem item) {
		if (item.isAvailable()) {
			items.add(item);
			totalPrice += item.getPrice();
			System.out.println(item.getName() + " added to order.");
		} else {
			System.out.println(item.getName() + " is out of stock.");
		}
	}

	@Override
	public void placeOrder() {
		if (items.isEmpty()) {
			System.out.println("No items in order.");
			return;
		}

		applyDiscount();

		System.out.println("-----------------------------------------------------");
		System.out.println("                    ORDER SUMMARY                    ");
		System.out.println("-----------------------------------------------------");

		for (int i = 0; i < items.size(); i++) {
			FoodItem item = items.get(i);
			System.out.println(item.getName() + " | " + item.getPrice() + " Rs");
		}

		System.out.println("-----------------------------------------------------");
		System.out.println("Total Price : " + totalPrice + " Rs");
		System.out.println("Final Price : " + finalAmount + " Rs");
		System.out.println("-----------------------------------------------------");
	}

	@Override
	public void cancelOrder() {
		items.clear();
		totalPrice = 0;
		finalAmount = 0;
		System.out.println("Order cancelled successfully.");
	}

	private void applyDiscount() {
		if (totalPrice > 1000) {
			finalAmount = totalPrice * 0.9;
		} else {
			finalAmount = totalPrice;
		}
	}
}
