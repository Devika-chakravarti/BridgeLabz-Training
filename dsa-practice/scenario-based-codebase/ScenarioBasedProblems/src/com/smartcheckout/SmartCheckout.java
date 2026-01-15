package com.smartcheckout;

import java.util.HashMap;

public class SmartCheckout {

	// Queue Implementation
	private static class Node {
		Customer data;
		Node next;

		Node(Customer data) {
			this.data = data;
		}
	}

	private Node front;
	private Node rear;
	private int queueSize;

	// Item Storage 
	private HashMap<String, Item> itemMap;

	public SmartCheckout() {
		itemMap = new HashMap<>();
		initializeItems();
	}

	private void initializeItems() {
		itemMap.put("Milk", new Item("Milk", 50, 10));
		itemMap.put("Bread", new Item("Bread", 30, 15));
		itemMap.put("Apple", new Item("Apple", 6, 30));
		itemMap.put("Toy", new Item("Toy", 10, 50));
		itemMap.put("Cookies", new Item("Cookies", 20, 40));
		itemMap.put("Cakes", new Item("Cakes", 15, 30));
	}

	public void showAvailableItems() {
		System.out.println("--------------------------------------");
		for (String key : itemMap.keySet()) {
			Item item = itemMap.get(key);
			System.out.println(item.getName() + " | Price: " + item.getPrice() + " | Stock: " + item.getStock());
		}
		System.out.println("--------------------------------------");
	}

	// Queue Operations 
	public void addCustomer(Customer customer) {
		Node newNode = new Node(customer);

		if (rear == null) {
			front = rear = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
		queueSize++;
	}

	public void processNextCustomer() {

		if (front == null) {
			System.out.println("No customers in queue");
			return;
		}

		Customer customer = front.data;
		front = front.next;

		if (front == null) {
			rear = null;
		}
		queueSize--;

		double totalBill = 0;

		System.out.println();
		System.out.println("----------------------------");
		System.out.println("          BILL");
		System.out.println("----------------------------");
		System.out.println("Customer ID: " + customer.customerId);
		System.out.println("----------------------------");

		for (int i = 0; i < customer.itemsToBuy.length; i++) {
			String itemName = customer.itemsToBuy[i];
			Item item = itemMap.get(itemName);

			if (item != null && item.reduceStock()) {
				System.out.println(item.getName() + " : " + item.getPrice());
				totalBill += item.getPrice();
			} else {
				System.out.println(itemName + " : Out of stock");
			}
		}

		System.out.println("----------------------------");
		System.out.println("Total Amount: " + totalBill);
		System.out.println("----------------------------");
		System.out.println();

		System.out.println("Updated stock:");
		showAvailableItems();
	}

	public void showQueueStatus() {
		System.out.println("Customers waiting: " + queueSize);
	}
}
