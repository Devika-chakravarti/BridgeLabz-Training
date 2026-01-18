/* Smart Warehouse Management System
 * Concepts: Generic Classes, Bounded Type Parameters, Wildcards
Problem Statement:
You are developing a Smart Warehouse System that manages different types of items like Electronics, Groceries, and Furniture. The system should be able to store and retrieve items dynamically while maintaining type safety.
Hints:
Create an abstract class WarehouseItem that all items extend (Electronics, Groceries, Furniture).
Implement a generic class Storage<T extends WarehouseItem> to store items safely.
Implement a wildcard method to display all items in storage regardless of their type (List<? extends WarehouseItem>).
*/

package com.generics.smartwarehousesystem;

import java.util.Scanner;

public class SmartWarehouse {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Storage<Electronics> electronicsStorage = new Storage<>();
		Storage<Groceries> groceriesStorage = new Storage<>();
		Storage<Furniture> furnitureStorage = new Storage<>();

		System.out.print("Enter number of items to add: ");
		int n = input.nextInt();
		input.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.println("\n1. Electronics\n2. Groceries\n3. Furniture");
			System.out.print("Choose item type: ");
			int choice = input.nextInt();
			input.nextLine();

			System.out.print("Enter item name: ");
			String name = input.nextLine();

			if (choice == 1) {
				electronicsStorage.addItem(new Electronics(name));
			} else if (choice == 2) {
				groceriesStorage.addItem(new Groceries(name));
			} else if (choice == 3) {
				furnitureStorage.addItem(new Furniture(name));
			} else {
				System.out.println("Invalid choice");
			}
		}

		System.out.println("\n---------------- Electronics ----------------");
		WarehouseUtil.displayAllItems(electronicsStorage.getItems());

		System.out.println("\n---------------- Groceries ----------------");
		WarehouseUtil.displayAllItems(groceriesStorage.getItems());

		System.out.println("\n---------------- Furniture ----------------");
		WarehouseUtil.displayAllItems(furnitureStorage.getItems());
	}
}
