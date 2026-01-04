package com.linkedlist.circularlinkedlist.taskscheduler;

public class UseTaskScheduler {
	public static void main(String[] args) {

		TaskCircularLinkedList tasks = new TaskCircularLinkedList();

		System.out.println("========================================");
		System.out.println("           TASK SCHEDULER");
		System.out.println("========================================\n");

		System.out.println("----------------------------------------");
		System.out.println("OPERATION 1: ADD TASKS");
		System.out.println("----------------------------------------");
		tasks.addAtBeginning(101, "Design UI", "High", "2026-01-10");
		tasks.addAtEnd(102, "Write Backend", "Medium", "2026-01-12");
		tasks.addAtPosition(2, 103, "Database Setup", "High", "2026-01-11");

		System.out.println("----------------------------------------");
		System.out.println("OPERATION 2: DISPLAY ALL TASKS");
		System.out.println("----------------------------------------");
		tasks.displayAll();

		System.out.println("----------------------------------------");
		System.out.println("OPERATION 3: VIEW CURRENT TASK & MOVE NEXT");
		System.out.println("----------------------------------------");
		tasks.viewCurrentTask();
		System.out.println("Move to next task...");
		tasks.viewCurrentTask();

		System.out.println("----------------------------------------");
		System.out.println("OPERATION 4: SEARCH TASK BY PRIORITY");
		System.out.println("----------------------------------------");
		tasks.searchByPriority("High");

		System.out.println("----------------------------------------");
		System.out.println("OPERATION 5: REMOVE TASK");
		System.out.println("----------------------------------------");
		tasks.removeById(101);

		System.out.println("----------------------------------------");
		System.out.println("UPDATED TASK LIST");
		System.out.println("----------------------------------------");
		tasks.displayAll();

	}
}
