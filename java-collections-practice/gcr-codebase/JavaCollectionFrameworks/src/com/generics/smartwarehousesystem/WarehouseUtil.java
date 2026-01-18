package com.generics.smartwarehousesystem;
import java.util.List;
public class WarehouseUtil {

	static void displayAllItems(List<? extends WarehouseItem> items) {
		for (int i = 0; i < items.size(); i++) {
			items.get(i).displayDetails();
		}
	}
}
