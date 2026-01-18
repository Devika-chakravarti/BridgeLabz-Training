/* Dynamic Online Marketplace
*  Concepts: Type Parameters, Generic Methods, Bounded Type Parameters
Problem Statement:
Build a generic product catalog for an online marketplace that supports various product types like Books, Clothing, and Gadgets. Each product type has a specific price range and category.
Hints:
Define a generic class Product<T> where T is restricted to a category (BookCategory, ClothingCategory, etc.).
Implement a generic method to apply discounts dynamically (<T extends Product> void applyDiscount(T product, double percentage)).
Ensure type safety while allowing multiple product categories to exist in the same catalog.
*/

package com.generics.dynamiconlinemarketplace;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlineMarketplace {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		List<Product<? extends Category>> catalog = new ArrayList<>();

		System.out.print("Enter number of products: ");
		int n = input.nextInt();
		input.nextLine();

		for (int i = 0; i < n; i++) {

			System.out.println("\n1. Book\n2. Clothing\n3. Gadget");
			System.out.print("Choose product category: ");
			int choice = input.nextInt();
			input.nextLine();

			System.out.print("Enter product name: ");
			String name = input.nextLine();

			System.out.print("Enter price: ");
			double price = input.nextDouble();
			input.nextLine();

			if (choice == 1) {
				Product<BookCategory> book = new Product<>(name, price, new BookCategory());
				catalog.add(book);

			} else if (choice == 2) {
				Product<ClothingCategory> clothing = new Product<>(name, price, new ClothingCategory());
				catalog.add(clothing);

			} else if (choice == 3) {
				Product<GadgetCategory> gadget = new Product<>(name, price, new GadgetCategory());
				catalog.add(gadget);

			} else {
				System.out.println("Invalid choice");
			}
		}

		System.out.print("\nEnter discount percentage: ");
		double discount = input.nextDouble();

		for (int i = 0; i < catalog.size(); i++) {
			DiscountUtil.applyDiscount(catalog.get(i), discount);
		}

		System.out.println("\n------------------------ Product Catalog After Discount ------------------------");
		for (int i = 0; i < catalog.size(); i++) {
			catalog.get(i).displayProduct();
		}
	}
}
