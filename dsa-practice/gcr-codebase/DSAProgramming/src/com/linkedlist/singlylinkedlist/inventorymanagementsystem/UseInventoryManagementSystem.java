package com.linkedlist.singlylinkedlist.inventorymanagementsystem;

public class UseInventoryManagementSystem {
	public static void main(String[] args) {

		InventoryLinkedList list = new InventoryLinkedList();

		System.out.println("========================================");
		System.out.println("       INVENTORY MANAGEMENT SYSTEM");
		System.out.println("========================================\n");

		System.out.println("ADDING ITEMS TO INVENTORY:");
		System.out.println("---------------------------------------");
		list.addAtBeginning(101, "Pen", 50, 10);
		list.addAtEnd(102, "Notebook", 30, 50);
		list.addAtEnd(103, "Pencil", 100, 5);

		System.out.println("\nDISPLAYING ALL INVENTORY ITEMS:");
		list.display();

		System.out.print("UPDATE QUANTITY BY ITEM ID: ");
		list.updateQuantity(102, 40);

		System.out.println("\nSEARCH ITEM BY ID:");
		System.out.println("---------------------------------------");
		list.searchById(101);

		System.out.print("TOTAL INVENTORY VALUE:");
		list.calculateTotalValue();

		System.out.println("\nSORTING INVENTORY BY PRICE (Ascending):");
		list.sortByPrice();
		list.display();

		System.out.println("========================================");
		System.out.println("        END OF INVENTORY REPORT");
		System.out.println("========================================");
	}
}
