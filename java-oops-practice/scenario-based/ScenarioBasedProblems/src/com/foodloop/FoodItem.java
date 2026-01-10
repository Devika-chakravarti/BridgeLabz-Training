package com.foodloop;

public class FoodItem {

	private String name;
	private String category;
	private double price;
	private boolean available;

	public FoodItem(String name, String category, double price, boolean available) {
		this.name = name;
		this.category = category;
		this.price = price;
		this.available = available;
	}

	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}

	public double getPrice() {
		return price;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailability(boolean available) {
		this.available = available;
	}

	public void displayItem() {
		System.out.println(
				name + " | " + category + " | " + price + " Rs | " + (available ? "Available" : "Out of Stock"));
	}
}
