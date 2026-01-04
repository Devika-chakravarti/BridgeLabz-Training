package com.linkedlist.circularlinkedlist.taskscheduler;

class TaskNode {
	int taskId;
	String taskName;
	String priority;
	String dueDate;
	TaskNode next;

	TaskNode(int id, String name, String prio, String date) {
		taskId = id;
		taskName = name;
		priority = prio;
		dueDate = date;
		next = null;
	}
}
