package com.generics.dynamiconlinemarketplace;

public class DiscountUtil {
	static <T extends Product<?>> void applyDiscount(T product, double percentage) {
		double discountAmount = product.price * (percentage / 100);
		product.price = product.price - discountAmount;
	}
}
