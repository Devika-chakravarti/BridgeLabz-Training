/*MedInventory – Smart Hospital Inventory Tracker
Story: At Apollo International Hospital, a new system called MedInventory is being built to track
medical supplies such as gloves, syringes, and oxygen cylinders.
Every morning, the inventory data is dumped as a .csv file containing:
ItemID,ItemName,Quantity,ExpiryDate
The Java system must:
● Read inventory files using BufferedReader (I/O Streams)
● Detect expired items using Regex on the ExpiryDate field (dd-MM-yyyy)
● Categorize items by type using Map<String, List<Item>>
● Remove duplicates using Set<Item> based on item ID
● Use Generics to allow extension to surgical tools, medicines, etc.
● Raise custom exceptions for critically low supplies
*/

package com.medinventory;

import java.util.*;
import java.io.*;

public class MedInventoryMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		InventoryProcessor processor = new InventoryProcessor();

		System.out.print("Enter inventory CSV file path: ");
		String filePath = input.nextLine();

		List<Item<String>> items = new ArrayList<Item<String>>();
		try {
			items = processor.readInventory(filePath);
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
			return;
		}

		// Detect expired items
		List<Item<String>> expiredItems = processor.getExpiredItems(items);
		if (expiredItems.size() > 0) {
			System.out.println("\nExpired Items:");
			for (int i = 0; i < expiredItems.size(); i++) {
				System.out.println(expiredItems.get(i));
			}
		} else {
			System.out.println("\nNo expired items found.");
		}

		// Categorize items by type
		Map<String, List<Item<?>>> categorized = processor.categorizeByType(items);
		System.out.println("\nItems categorized by type:");
		for (Iterator<String> it = categorized.keySet().iterator(); it.hasNext();) {
			String type = it.next();
			System.out.println("Type: " + type);
			List<Item<?>> typeItems = categorized.get(type);
			for (int i = 0; i < typeItems.size(); i++) {
				System.out.println("  " + typeItems.get(i));
			}
		}

		// Check for critically low stock
		System.out.print("\nEnter threshold for critically low stock: ");
		int threshold = input.nextInt();
		input.nextLine();

		try {
			processor.checkLowStock(items, threshold);
			System.out.println("No critically low items.");
		} catch (LowStockException e) {
			System.out.println("ALERT: " + e.getMessage());
		}
	}
}
