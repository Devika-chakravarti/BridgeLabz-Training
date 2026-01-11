package com.ambulanceroute;

public class UnitNode {
	String name;
	boolean available;
	UnitNode next;

	public UnitNode(String name, boolean available) {
		this.name = name;
		this.available = available;
		this.next = null;
	}
}
