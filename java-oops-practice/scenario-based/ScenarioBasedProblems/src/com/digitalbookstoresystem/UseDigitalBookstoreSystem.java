/* Scenario-based: 15
 * 
 * "BookBazaar – Digital Bookstore System"
Story: You’re building the backend for BookBazaar, an online bookstore. It must handle book
inventory, orders, and discounts.
Requirements:
● Book class with fields: title, author, price, stock.
● Order class that links a user to one or more books.
● Interface IDiscountable with method applyDiscount().
● Use constructors to create books with optional offers.
● Use operators to compute total cost: price × quantity – discount.
● Encapsulation: inventory count should only be updated through methods.
● Inheritance: EBook, PrintedBook extend Book.
● Polymorphism: applyDiscount() works differently for each book type.
● Access modifiers used to restrict order status updates.
 * */

package com.digitalbookstoresystem;

import java.util.Scanner;

public class UseDigitalBookstoreSystem {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("=============================================================");
		System.out.println("                  WELCOME TO BOOKBAZAAR");
		System.out.println("=============================================================");

		// Available books in the bookstore
		Book[] ebooks = { new EBook("Atomic Habits", "James Clear", 250, 20),
				new EBook("Deep Work", "Cal Newport", 300, 20), new EBook("Ikigai", "Hector Garcia", 200, 20) };

		Book[] printedBooks = { new PrintedBook("Atomic Habits", "James Clear", 350, 20),
				new PrintedBook("Deep Work", "Cal Newport", 450, 20),
				new PrintedBook("Ikigai", "Hector Garcia", 300, 20) };

		System.out.println("Select Book Format:");
		System.out.println("1. EBook");
		System.out.println("2. Printed Book");
		System.out.print("Enter choice : ");
		int formatChoice = input.nextInt();

		Book[] selectedList = (formatChoice == 1) ? ebooks : printedBooks;

		System.out.println();
		System.out.println("Available Books:");
		System.out.println("-------------------------------------------------------------");

		for (int i = 0; i < selectedList.length; i++) {
			System.out.println((i + 1) + ". " + selectedList[i].title + " | " + selectedList[i].author + " | Price: Rs "
					+ selectedList[i].getPrice() + " | Stock: " + selectedList[i].getStock());
		}

		System.out.println("-------------------------------------------------------------");
		System.out.print("\nChoose Book (1-3) : ");
		int bookChoice = input.nextInt();

		Book selectedBook = selectedList[bookChoice - 1];

		System.out.print("Enter Quantity   : ");
		int quantity = input.nextInt();

		Order order = new Order(selectedBook, quantity);
		order.placeOrder();
		order.displayOrderDetails();

		System.out.println("=============================================================");
		System.out.println("             THANK YOU FOR USING BOOKBAZAAR");
		System.out.println("=============================================================");

		input.close();
	}
}
