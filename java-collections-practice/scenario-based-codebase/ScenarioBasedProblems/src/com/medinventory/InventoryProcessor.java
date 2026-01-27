package com.medinventory;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InventoryProcessor {

	private Set<Item> uniqueItems = new HashSet<Item>();

	// Read inventory CSV file and create Item objects
	public List<Item<String>> readInventory(String filePath) throws IOException {
		List<Item<String>> items = new ArrayList<Item<String>>();
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		String line;

		line = br.readLine();

		while ((line = br.readLine()) != null) {
			String[] parts = line.split(",");
			if (parts.length != 4)
				continue;

			String id = parts[0].trim();
			String name = parts[1].trim();
			int qty = Integer.parseInt(parts[2].trim());
			String expiry = parts[3].trim();

			Item<String> item = new Item<String>(id, name, qty, expiry, "GenericItem");

			// Add to Set to remove duplicates
			if (!uniqueItems.contains(item)) {
				uniqueItems.add(item);
				items.add(item);
			}
		}
		br.close();
		return items;
	}

	// Detect expired items using regex and date comparison
	public List<Item<String>> getExpiredItems(List<Item<String>> items) {
		List<Item<String>> expired = new ArrayList<Item<String>>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date today = new Date();

		Pattern datePattern = Pattern.compile("\\d{2}-\\d{2}-\\d{4}");

		for (int i = 0; i < items.size(); i++) {
			String expiry = items.get(i).getExpiryDate();
			Matcher matcher = datePattern.matcher(expiry);
			if (matcher.matches()) {
				try {
					Date expDate = sdf.parse(expiry);
					if (expDate.before(today)) {
						expired.add(items.get(i));
					}
				} catch (ParseException e) {
					// Skip invalid date formats
				}
			}
		}

		return expired;
	}

	// Categorize items by type
	public Map<String, List<Item<?>>> categorizeByType(List<Item<String>> items) {
		Map<String, List<Item<?>>> categoryMap = new HashMap<String, List<Item<?>>>();

		for (int i = 0; i < items.size(); i++) {
			String type = items.get(i).getItemType();
			if (!categoryMap.containsKey(type)) {
				categoryMap.put(type, new ArrayList<Item<?>>());
			}
			categoryMap.get(type).add(items.get(i));
		}

		return categoryMap;
	}

	// Check for critically low stock and raise exception
	public void checkLowStock(List<Item<String>> items, int threshold) throws LowStockException {
		for (int i = 0; i < items.size(); i++) {
			if (items.get(i).getQuantity() < threshold) {
				throw new LowStockException("Critically low stock: " + items.get(i).getItemName() + " (Qty: "
						+ items.get(i).getQuantity() + ")");
			}
		}
	}
}
