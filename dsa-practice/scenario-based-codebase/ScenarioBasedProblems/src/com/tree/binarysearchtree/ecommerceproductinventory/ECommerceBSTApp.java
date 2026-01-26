/* Story: E-Commerce Product Inventory
An online store categorizes products by SKU numbers.
Scenarios:
● 🔹 Scenario 1: Lookup — Customers search for a product using SKU.
● 🔹 Scenario 2: Price Update — Admin updates products using SKU key.
● 🔹 Scenario 3: Sorted List — Display all products in sorted SKU order.
 * */

package com.tree.binarysearchtree.ecommerceproductinventory;

import java.util.Scanner;

public class ECommerceBSTApp {

	public static void main(String[] args) {

		ProductBST bst = new ProductBST();
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("\n======================================================");
			System.out.println("  WELCOME TO OUR ECOMMERCE PRODUCT INVENTORY SYSTEM");
			System.out.println("======================================================\n");
			System.out.println("1. Add Product");
			System.out.println("2. Search Product");
			System.out.println("3. Update Price");
			System.out.println("4. Display Products (Sorted)");
			System.out.println("5. Exit");
			System.out.print("Enter choice: ");

			int choice = input.nextInt();
			input.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter SKU: ");
				int sku = input.nextInt();
				input.nextLine();
				System.out.print("Enter Product Name: ");
				String name = input.nextLine();
				System.out.print("Enter Price: ");
				double price = input.nextDouble();
				bst.insert(new Product(sku, name, price));
				break;

			case 2:
				System.out.print("Enter SKU to search: ");
				int searchSku = input.nextInt();
				Product p = bst.search(searchSku);
				System.out.println(p != null ? p : "Product not found");
				break;

			case 3:
				System.out.print("Enter SKU: ");
				int updateSku = input.nextInt();
				System.out.print("Enter new price: ");
				double newPrice = input.nextDouble();
				bst.updatePrice(updateSku, newPrice);
				break;

			case 4:
				bst.displaySorted();
				break;

			case 5:
				System.out.println("\n======================================================");
				System.out.println("            THANK YOU FOR USING SYSTEM");
				System.out.println("======================================================");
				return;

			default:
				System.out.println("Invalid choice");
			}
		}
	}
}
