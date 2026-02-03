/*Order Revenue Summary
○ Scenario: Sum order totals per customer.
○ Task: Use Collectors.summingDouble()*/

package com.collectors.orderrevenuesummary;

import java.util.*;
import java.util.stream.Collectors;

class Order {
	String customerName;
	double amount;

	Order(String customerName, double amount) {
		this.customerName = customerName;
		this.amount = amount;
	}

	public String getCustomerName() {
		return customerName;
	}

	public double getAmount() {
		return amount;
	}
}

public class OrderRevenueSummary {
	public static void main(String[] args) {

		List<Order> orders = Arrays.asList(new Order("Devika", 250.50), new Order("Annu", 300.00),
				new Order("Lucky", 149.50), new Order("Ram", 200.00), new Order("Siya", 400.00));

		Map<String, Double> revenueByCustomer = orders.stream()
				.collect(Collectors.groupingBy(Order::getCustomerName, Collectors.summingDouble(Order::getAmount)));

		System.out.println(revenueByCustomer);
	}
}
