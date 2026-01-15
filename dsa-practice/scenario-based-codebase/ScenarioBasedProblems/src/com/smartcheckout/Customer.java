package com.smartcheckout;

public class Customer {
	int customerId;
	String[] itemsToBuy;

	public Customer(int customerId, String[] itemsToBuy) {
		this.customerId = customerId;
		this.itemsToBuy = itemsToBuy;
	}
}
