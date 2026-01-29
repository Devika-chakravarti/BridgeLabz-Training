/*Invoice Object Creation
○ Scenario: Generate invoice objects from transaction IDs.
○ Task: Use a constructor reference.*/

package com.methodreferences.invoiceobjectcreation;

import java.util.*;

public class InvoiceCreation {

	static class Invoice {
		String transactionId;

		Invoice(String transactionId) {
			this.transactionId = transactionId;
		}

		public String toString() {
			return "Invoice generated for Transaction Id: " + transactionId;
		}
	}

	public static void main(String args[]) {
		List<String> transactionsIds = Arrays.asList("TID01", "TID02", "TID03");

		// creating invoice objects using constructor reference
		transactionsIds.stream().map(Invoice::new).forEach(System.out::println);
	}

}
