package com.linkedlist.circularlinkedlist.robinroundalgorithm;

class ProcessNode {
	String processId;
	int burstTime;
	int priority;
	int remainingTime;
	ProcessNode next;

	ProcessNode(String id, int bt, int prio) {
		processId = id;
		burstTime = bt;
		remainingTime = bt;
		priority = prio;
		next = null;
	}
}
