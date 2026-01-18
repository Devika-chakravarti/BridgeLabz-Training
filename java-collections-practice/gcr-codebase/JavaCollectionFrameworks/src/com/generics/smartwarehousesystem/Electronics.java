package com.generics.smartwarehousesystem;

class Electronics extends WarehouseItem {
	Electronics(String name) {
		super(name);
	}

	void displayDetails() {
		System.out.println("Electronics Item: " + name);
	}
}
