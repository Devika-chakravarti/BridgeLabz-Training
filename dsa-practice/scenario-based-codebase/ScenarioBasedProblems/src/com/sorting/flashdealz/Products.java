package com.sorting.flashdealz;

public class Products {
	protected int productId;
	protected String productName;
	protected double discount;

	public Products(int productId, String productName, double discount) {
		this.productId = productId;
		this.productName = productName;
		this.discount = discount;
	}

	public void display() {
		System.out.println(productId + " | " + productName + " | " + discount);
	}
}
