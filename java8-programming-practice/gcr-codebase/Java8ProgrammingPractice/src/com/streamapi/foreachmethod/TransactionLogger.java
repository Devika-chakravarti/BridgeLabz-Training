/*5. Logging Transactions
Given a list of transaction IDs, use forEach() to log each transaction to the console with a
timestamp.*/ 

package com.streamapi.foreachmethod;

import java.time.LocalDateTime;
import java.util.*;

public class TransactionLogger {
	private static void logTransaction(String transactionId) {
		System.out.println(LocalDateTime.now() + " - Transaction: " + transactionId);
	}

	private static void logAllTransactions(List<String> transactionIds) {
		transactionIds.forEach(id -> logTransaction(id));
	}

	public static void main(String[] args) {
		List<String> transactionIds = Arrays.asList("TXN1001", "TXN1002", "TXN1003");
		logAllTransactions(transactionIds);
	}
}
