package com.linkedlist.singlylinkedlist.inventorymanagementsystem;

//Node class for inventory item
class ItemNode {
	int itemId;
	String name;
	int quantity;
	double price;
	ItemNode next;

	// Constructor
	ItemNode(int itemId, String name, int quantity, double price) {
		this.itemId = itemId;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.next = null;
	}
}
