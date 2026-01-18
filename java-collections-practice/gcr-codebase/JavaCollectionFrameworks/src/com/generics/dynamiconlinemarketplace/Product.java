package com.generics.dynamiconlinemarketplace;

public class Product<T extends Category> {
	String name;
	double price;
	T category;

	Product(String name, double price, T category) {
		this.name = name;
		this.price = price;
		this.category = category;
	}

	void displayProduct() {
		System.out.println("Product: " + name + ", Category: " + category.getCategoryName() + ", Price: " + price);
	}
}
