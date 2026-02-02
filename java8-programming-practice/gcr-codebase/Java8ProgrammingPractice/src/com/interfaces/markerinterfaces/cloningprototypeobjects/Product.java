package com.interfaces.markerinterfaces.cloningprototypeobjects;

public class Product implements Cloneable {
	String name;
	double price;

	Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Product: " + name + ", price =" + price;
	}
}
