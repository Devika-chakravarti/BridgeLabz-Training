package com.tree.avltree.onlineticketbookingsystem;

public class Event {
	int time;
	String eventName;
	int height;

	Event left, right;

	Event(int time, String name) {
		this.time = time;
		this.eventName = name;
		height = 1;
	}
}
