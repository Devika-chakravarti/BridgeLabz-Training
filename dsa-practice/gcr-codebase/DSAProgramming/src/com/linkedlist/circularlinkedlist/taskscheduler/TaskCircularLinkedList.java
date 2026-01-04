package com.linkedlist.circularlinkedlist.taskscheduler;

class TaskCircularLinkedList {
	private TaskNode head;
	private TaskNode tail;
	private TaskNode current;

	// Add at beginning
	public void addAtBeginning(int id, String name, String prio, String date) {
		TaskNode t = new TaskNode(id, name, prio, date);
		if (head == null) {
			head = tail = current = t;
			tail.next = head;
		} else {
			t.next = head;
			head = t;
			tail.next = head;
		}
		printTask("beginning", t);
	}

	// Add at end
	public void addAtEnd(int id, String name, String prio, String date) {
		TaskNode t = new TaskNode(id, name, prio, date);
		if (head == null) {
			head = tail = current = t;
			tail.next = head;
		} else {
			tail.next = t;
			tail = t;
			tail.next = head;
		}
		printTask("end", t);
	}

	// Add at position
	public void addAtPosition(int pos, int id, String name, String prio, String date) {
		if (pos <= 1) {
			addAtBeginning(id, name, prio, date);
			return;
		}
		TaskNode temp = head;
		int count = 1;
		while (count < pos - 1 && temp.next != head) {
			temp = temp.next;
			count++;
		}
		TaskNode t = new TaskNode(id, name, prio, date);
		t.next = temp.next;
		temp.next = t;
		if (temp == tail)
			tail = t;
		printTask("position " + pos, t);
	}

	// Remove task by ID
	public void removeById(int id) {
		if (head == null)
			return;
		TaskNode temp = head;
		TaskNode prev = tail;
		do {
			if (temp.taskId == id) {
				if (temp == head) {
					head = head.next;
					tail.next = head;
				} else if (temp == tail) {
					prev.next = head;
					tail = prev;
				} else {
					prev.next = temp.next;
				}
				System.out.println("Task removed");
				System.out.println("Task ID : " + id + "\n");
				return;
			}
			prev = temp;
			temp = temp.next;
		} while (temp != head);
	}

	// Display all tasks
	public void displayAll() {
		if (head == null)
			return;
		TaskNode temp = head;
		do {
			System.out.print(temp.taskId);
			if (temp.next != head)
				System.out.print(" -> ");
			temp = temp.next;
		} while (temp != head);
		System.out.println("\n");
	}

	// View current task and move next
	public void viewCurrentTask() {
		if (current == null)
			return;
		System.out.println("Current Task:");
		System.out.println("ID   : " + current.taskId);
		System.out.println("Name : " + current.taskName + "\n");
		current = current.next;
	}

	// Search by priority
	public void searchByPriority(String prio) {
		if (head == null)
			return;
		TaskNode temp = head;
		boolean found = false;
		System.out.println("Tasks with Priority " + prio + ":");
		do {
			if (temp.priority.equalsIgnoreCase(prio)) {
				System.out.println("ID   : " + temp.taskId + ", Name : " + temp.taskName);
				found = true;
			}
			temp = temp.next;
		} while (temp != head);
		if (!found)
			System.out.println("No tasks found");
		System.out.println();
	}

	private void printTask(String pos, TaskNode t) {
		System.out.println("Task added at " + pos);
		System.out.println("Task ID   : " + t.taskId);
		System.out.println("Name      : " + t.taskName);
		System.out.println("Priority  : " + t.priority);
		System.out.println("Due Date  : " + t.dueDate + "\n");
	}
}
