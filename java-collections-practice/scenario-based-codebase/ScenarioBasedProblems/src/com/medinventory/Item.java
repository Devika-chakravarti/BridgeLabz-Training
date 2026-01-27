package com.medinventory;

import java.io.Serializable;

public class Item<T> implements Serializable {
	private String itemId;
	private String itemName;
	private int quantity;
	private String expiryDate;
	private T itemType;

	public Item(String itemId, String itemName, int quantity, String expiryDate, T itemType) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.quantity = quantity;
		this.expiryDate = expiryDate;
		this.itemType = itemType;
	}

	public String getItemId() {
		return itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public T getItemType() {
		return itemType;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || !(obj instanceof Item))
			return false;
		Item other = (Item) obj;
		return this.itemId.equals(other.getItemId());
	}

	@Override
	public int hashCode() {
		return itemId.hashCode();
	}

	@Override
	public String toString() {
		return "ItemID: " + itemId + ", Name: " + itemName + ", Quantity: " + quantity + ", Expiry: " + expiryDate;
	}
}
