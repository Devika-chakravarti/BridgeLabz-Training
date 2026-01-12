package com.callcenter;

import java.util.HashMap;
import java.util.Map;

public class CustomerManager {

	// Using HashMap to track call counts for each customer
	private Map<Integer, Integer> callHistory = new HashMap<>();

	// Records a call for a customer
	public void recordCall(int customerId) {
		callHistory.put(customerId, callHistory.getOrDefault(customerId, 0) + 1);
	}

	// Returns the number of calls made by a customer
	public int getCallCount(int customerId) {
		return callHistory.getOrDefault(customerId, 0);
	}

	public void displayCallHistory() {
		if (callHistory.isEmpty()) {
			System.out.println("No customer call history available.");
			return;
		}

		System.out.println("\n========= CUSTOMER CALL HISTORY =========");

		// entrySet
		Object[] keys = callHistory.keySet().toArray(); // array of keys
		for (int i = 0; i < keys.length; i++) {
			int customerId = (Integer) keys[i];
			int calls = callHistory.get(customerId);
			System.out.println("Customer ID: " + customerId + " -> Calls this month: " + calls);
		}
	}
}
