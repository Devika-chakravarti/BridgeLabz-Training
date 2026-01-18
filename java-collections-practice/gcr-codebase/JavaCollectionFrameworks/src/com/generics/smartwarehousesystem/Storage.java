package com.generics.smartwarehousesystem;

import java.util.ArrayList;
import java.util.List;

class Storage<T extends WarehouseItem> {

	private List<T> items = new ArrayList<>();

	void addItem(T item) {
		items.add(item);
	}

	List<T> getItems() {
		return items;
	}
}
