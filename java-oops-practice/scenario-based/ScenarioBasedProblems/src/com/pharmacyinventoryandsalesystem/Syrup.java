package com.pharmacyinventoryandsalesystem;

import java.time.LocalDate;

public class Syrup extends Medicine {

	public Syrup(String name, double price, LocalDate manufacturingDate, LocalDate expiryDate, int quantity) {

		super(name, price, manufacturingDate, expiryDate, quantity);
	}

	@Override
	public boolean checkExpiry() {
		return expiryDate.isBefore(LocalDate.now().plusDays(1));
	}
}
