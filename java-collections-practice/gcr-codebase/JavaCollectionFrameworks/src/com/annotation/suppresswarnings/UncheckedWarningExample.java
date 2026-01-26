package com.annotation.suppresswarnings;

import java.util.ArrayList;

public class UncheckedWarningExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		// Adding different types of data
		list.add("Java");
		list.add(10);

		// Printing values from the list
		for (Object item : list) {
			System.out.println(item);
		}
	}
}
