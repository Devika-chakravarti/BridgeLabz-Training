package com.pharmacyinventoryandsalesystem;

import java.time.LocalDate;

public class Tablet extends Medicine {

	public Tablet(String name, double price, LocalDate manufacturingDate, LocalDate expiryDate, int quantity) {

		super(name, price, manufacturingDate, expiryDate, quantity);
	}

	@Override
	public boolean checkExpiry() {
		return expiryDate.isBefore(LocalDate.now());
	}
}
