/* Scenario-based: 9 
 * 
 * "SwiftCart – The Grocery Shopping App"
Story: You're building SwiftCart, an online grocery platform where users add items to cart and
check out. The backend logic for cart management is your task.
Requirements:
● Product class: name, price, category.
● Cart class: holds a list of products and totalPrice.
● Constructors allow cart creation with or without pre-selected items.
● ICheckout interface with generateBill() and applyDiscount().
● Use encapsulation to protect price calculations.
● Operators for total: price * quantity, discount: totalPrice - coupon.
● Inheritance: different product types like PerishableProduct,
NonPerishableProduct.
● Use polymorphism in discount application (e.g., discount varies by product type).
● Apply access modifiers so only Cart can update prices.
 * 
 * */


package com.groceryshoppingapp;

import java.util.Scanner;

public class UseGroceryShoppingApplication {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Cart cart = new Cart();

		System.out.println("========= WELCOME TO SWIFTCART =========");

		while (true) {
			System.out.println("\n1. Add Product");
			System.out.println("2. Checkout");
			System.out.println("3. Exit");
			System.out.print("Choose option: ");

			int choice = input.nextInt();
			input.nextLine(); // clear buffer: used to consume the remaining newline character (\n) in the
								// input buffer.

			if (choice == 1) {

				System.out.print("Enter product name: ");
				String name = input.nextLine();

				System.out.print("Enter price: ");
				double price = input.nextDouble();
				input.nextLine(); // clear buffer

				System.out.print("Enter category: ");
				String category = input.nextLine();

				System.out.print("Enter quantity: ");
				int quantity = input.nextInt();
				input.nextLine(); // clear buffer

				System.out.println("Product Type:");
				System.out.println("1. Perishable");
				System.out.println("2. Non-Perishable");
				int type = input.nextInt();
				input.nextLine(); // clear buffer

				Product product;

				if (type == 1) {
					product = new PerishableProduct(name, price, category);
				} else {
					product = new NonPerishableProduct(name, price, category);
				}

				cart.addProduct(product, quantity);
				System.out.println("Product added to cart!");
				System.out.println("-----------------------------------------");

			} else if (choice == 2) {
				cart.applyDiscount();
				cart.generateBill();
			} else if (choice == 3) {
				System.out.println("\nThank you for using SwiftCart!");
				break;
			} else {
				System.out.println("Invalid choice!");
			}
		}

		input.close();
	}
}
