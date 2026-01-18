package com.generics.smartwarehousesystem;

class Groceries extends WarehouseItem {
	Groceries(String name) {
		super(name);
	}

	void displayDetails() {
		System.out.println("Grocery Item: " + name);
	}
}
