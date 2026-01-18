package com.generics.smartwarehousesystem;

class Furniture extends WarehouseItem {
	Furniture(String name) {
		super(name);
	}

	void displayDetails() {
		System.out.println("Furniture Item: " + name);
	}
}
