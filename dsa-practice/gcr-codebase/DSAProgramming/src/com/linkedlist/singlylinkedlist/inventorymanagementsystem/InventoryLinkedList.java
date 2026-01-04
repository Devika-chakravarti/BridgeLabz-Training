package com.linkedlist.singlylinkedlist.inventorymanagementsystem;

//Singly Linked List for inventory
class InventoryLinkedList {
	private ItemNode head;

	// Add item at beginning
	public void addAtBeginning(int id, String name, int qty, double price) {
		ItemNode newNode = new ItemNode(id, name, qty, price);
		newNode.next = head;
		head = newNode;
		System.out.println("Item added at beginning");
	}

	// Add item at end
	public void addAtEnd(int id, String name, int qty, double price) {
		ItemNode newNode = new ItemNode(id, name, qty, price);
		if (head == null) {
			head = newNode;
			System.out.println("Item added at end");
			return;
		}
		ItemNode temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		System.out.println("Item added at end");
	}

	// Update quantity by item id
	public void updateQuantity(int id, int newQty) {
		ItemNode temp = head;
		while (temp != null) {
			if (temp.itemId == id) {
				temp.quantity = newQty;
				System.out.println(id);
				return;
			}
			temp = temp.next;
		}
		System.out.println("Item not found");
	}

	// Search item by id
	public void searchById(int id) {
		ItemNode temp = head;
		while (temp != null) {
			if (temp.itemId == id) {
				System.out.println("Item found");
				printItem(temp);
				return;
			}
			temp = temp.next;
		}
		System.out.println("Item not found");
	}

	// Display all items
	public void display() {
		ItemNode temp = head;
		while (temp != null) {
			printItem(temp);
			temp = temp.next;
		}
	}

	// Calculate total inventory value
	public void calculateTotalValue() {
		double total = 0;
		ItemNode temp = head;
		while (temp != null) {
			total += temp.price * temp.quantity;
			temp = temp.next;
		}
		System.out.println(total);
	}

	// Sort by price (ascending)
	public void sortByPrice() {
		for (ItemNode i = head; i != null; i = i.next) {
			for (ItemNode j = i.next; j != null; j = j.next) {
				if (i.price > j.price) {
					swapData(i, j);
				}
			}
		}
	}

	// Swap item data
	private void swapData(ItemNode a, ItemNode b) {
		int id = a.itemId;
		a.itemId = b.itemId;
		b.itemId = id;
		String n = a.name;
		a.name = b.name;
		b.name = n;
		int q = a.quantity;
		a.quantity = b.quantity;
		b.quantity = q;
		double p = a.price;
		a.price = b.price;
		b.price = p;
	}

	private void printItem(ItemNode item) {
		System.out.println("---------------------------------------");
		System.out.println("Item ID   : " + item.itemId);
		System.out.println("Name      : " + item.name);
		System.out.println("Quantity  : " + item.quantity);
		System.out.println("Price     : " + item.price);
		System.out.println("---------------------------------------\n");
	}
}
