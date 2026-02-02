/*Cloning Prototype Objects
○ Scenario: Clone a predefined object model.
○ Task: Use Cloneable marker interface.*/

package com.interfaces.markerinterfaces.cloningprototypeobjects;

public class CloneApp {
	public static void main(String[] args) {

		try {
			Product original = new Product("Laptop", 75000);
			Product copy = (Product) original.clone();

			System.out.println("Original: " + original);
			System.out.println("Copy    : " + copy);

		} catch (CloneNotSupportedException e) {
			System.out.println("Cloning not supported");
		}
	}
}
