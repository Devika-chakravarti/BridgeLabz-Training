package com.digitalbookstoresystem;

public abstract class Book implements IDiscountable {

	protected String title;
	protected String author;
	protected double price;
	private int stock;

	public Book(String title, String author, double price, int stock) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.stock = stock;
	}

	public boolean isAvailable(int quantity) {
		return stock >= quantity;
	}

	public void reduceStock(int quantity) {
		if (stock >= quantity) {
			stock -= quantity;
		}
	}

	public int getStock() {
		return stock;
	}

	public double getPrice() {
		return price;
	}
}
