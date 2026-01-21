package com.sorting.foodfest;

public class FoodStall {
	protected int stallId;
	protected String stallName;
	protected int customers;

	public FoodStall(int stallId, String stallName, int customers) {
		this.stallId = stallId;
		this.stallName = stallName;
		this.customers = customers;
	}
}
