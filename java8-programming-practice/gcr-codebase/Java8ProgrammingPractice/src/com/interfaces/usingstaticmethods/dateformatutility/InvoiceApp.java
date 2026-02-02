/*Date Format Utility
○ Scenario: An invoice generator must format dates in multiple formats.
○ Task: Use a static interface method to format dates.*/

package com.interfaces.usingstaticmethods.dateformatutility;

import java.time.LocalDate;

public class InvoiceApp {
	public static void main(String[] args) {

		LocalDate invoiceDate = LocalDate.now();

		String ddMMyyyy = DateUtils.formatDate(invoiceDate, "dd-MM-yyyy");

		String yyyyMMdd = DateUtils.formatDate(invoiceDate, "yyyy/MM/dd");

		System.out.println("Invoice Date (DD-MM-YYYY): " + ddMMyyyy);
		System.out.println("Invoice Date (YYYY/MM/DD): " + yyyyMMdd);
	}
}
