package com.generics.smartwarehousesystem;

public abstract class WarehouseItem {
	String name;

	WarehouseItem(String name) {
		this.name = name;
	}

	abstract void displayDetails();
}
