/*Custom Sorting in E-Commerce
○ Scenario: An online shop wants to sort products differently based on sales
campaigns (by price, rating, discount).
○ Task: Use a lambda with Comparator to sort products dynamically.*/

package com.lambdaexpression.customsortingecommerce;

import java.util.*;

public class ECommerceSorting {
	static class Product {
		String name;
		double price;
		double rating;
		double discount;

		Product(String name, double price, double rating, double discount) {
			this.name = name;
			this.price = price;
			this.rating = rating;
			this.discount = discount;
		}

		public String toString() {
			return name + " | Price: " + price + " | Rating: " + rating + " | Discount: " + discount;
		}
	}

	public static void main(String args[]) {
		List<Product> products = Arrays.asList(new Product("Laptop", 78000, 4.8, 10),
				new Product("Headphones", 7800, 4.3, 15), new Product("Smartphone", 25000, 4.5, 20));
		// sorting using lambda expression
		sortProducts(products, (p1, p2) -> Double.compare(p1.price, p2.price));
		sortProducts(products, (p1, p2) -> Double.compare(p1.rating, p2.rating));
		sortProducts(products, (p1, p2) -> Double.compare(p1.discount, p2.discount));
	}

	private static void sortProducts(List<Product> products, Comparator<Product> comparator) {
		products.sort(comparator);
		products.forEach(System.out::println);
		System.out.println();
	}
}
