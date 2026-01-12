package com.traincompanion;

public class CompartmentNode {

	protected String name; // Compartment name
	protected CompartmentNode prev; // Previous compartment
	protected CompartmentNode next; // Next compartment

	public CompartmentNode(String name) {
		this.name = name;
		this.prev = null;
		this.next = null;
	}
}
