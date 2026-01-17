package com.sorting.icecreamrush;

public class IceCreams {
	protected String iceCreamFlavours;
	protected int quantity;

	public IceCreams(String iceCreamFlavours, int quantity) {
		this.iceCreamFlavours = iceCreamFlavours;
		this.quantity = quantity;
	}

	public void display() {
		System.out.println(iceCreamFlavours + " | " + quantity);
	}
}
