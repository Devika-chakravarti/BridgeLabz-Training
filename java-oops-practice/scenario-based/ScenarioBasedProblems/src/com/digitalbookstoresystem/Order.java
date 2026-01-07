package com.digitalbookstoresystem;

public class Order {

	private Book book;
	private int quantity;
	private String status;

	public Order(Book book, int quantity) {
		this.book = book;
		this.quantity = quantity;
		this.status = "CREATED";
	}

	public void placeOrder() {
		if (book.isAvailable(quantity)) {
			book.reduceStock(quantity);
			status = "PLACED";
		} else {
			status = "FAILED - OUT OF STOCK";
		}
	}

	public double calculateTotalCost() {
		double discount = book.applyDiscount();
		return (book.getPrice() * quantity) - discount;
	}

	public void displayOrderDetails() {
		System.out.println("\nFinal Order details:");
		System.out.println("-------------------------------------------------------------");
		System.out.println("Book Title   : " + book.title);
		System.out.println("Author       : " + book.author);
		System.out.println("Quantity     : " + quantity);
		System.out.println("Order Status : " + status);
		System.out.println("Total Cost   : Rs " + calculateTotalCost());
		System.out.println("-------------------------------------------------------------");
	}
}
