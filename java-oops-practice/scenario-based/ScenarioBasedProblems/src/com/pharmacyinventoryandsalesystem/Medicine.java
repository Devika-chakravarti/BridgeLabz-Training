package com.pharmacyinventoryandsalesystem;

import java.time.LocalDate;

public abstract class Medicine implements ISellable {

	protected String name;
	private double price; // sensitive pricing
	protected LocalDate manufacturingDate;
	protected LocalDate expiryDate;
	private int quantity; // internal stock

	public Medicine(String name, double price, LocalDate manufacturingDate, LocalDate expiryDate, int quantity) {

		this.name = name;
		this.price = price;
		this.manufacturingDate = manufacturingDate;
		this.expiryDate = expiryDate;
		this.quantity = quantity;
	}

	public Medicine(String name, double price, LocalDate manufacturingDate, LocalDate expiryDate) {

		this(name, price, manufacturingDate, expiryDate, 10);
	}

	protected int getQuantity() {
		return quantity;
	}

	protected LocalDate getManufacturingDate() {
		return manufacturingDate;
	}

	protected LocalDate getExpiryDate() {
		return expiryDate;
	}

	protected void reduceStock(int qty) {
		quantity -= qty;
	}

	private double calculateTotal(int qty) {
		double total = price * qty;
		if (total > 500) {
			total = total - (total * 0.10); // 10% discount
		}
		return total;
	}

	@Override
	public void sell(int qty) {

		if (checkExpiry()) {
			System.out.println("\n--------------------------------------------------");
			System.out.println("Medicine is expired. Cannot sell.");
			System.out.println("--------------------------------------------------");
			return;
		}

		if (qty > quantity) {
			System.out.println("\n--------------------------------------------------");
			System.out.println("Insufficient stock.");
			System.out.println("--------------------------------------------------");
			return;
		}

		double bill = calculateTotal(qty);
		reduceStock(qty);

		System.out.println("\n--------------------------------------------------");
		System.out.println("Medicine Sold Successfully");
		System.out.println("Total Amount : Rs " + bill);
		System.out.println("Remaining Stock : " + quantity);
		System.out.println("--------------------------------------------------");
	}
}
