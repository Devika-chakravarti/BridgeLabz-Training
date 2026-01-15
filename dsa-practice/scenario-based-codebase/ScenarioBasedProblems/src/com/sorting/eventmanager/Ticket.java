package com.sorting.eventmanager;

class Ticket {
	String eventName;
	double price;

	Ticket(String eventName, double price) {
		this.eventName = eventName;
		this.price = price;
	}

	void show() {
		System.out.println(eventName + " | Price: " + price);
	}
}
