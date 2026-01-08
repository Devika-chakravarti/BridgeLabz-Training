package com.pharmacyinventoryandsalesystem;

public interface ISellable {
	void sell(int qty);
	boolean checkExpiry();
}
