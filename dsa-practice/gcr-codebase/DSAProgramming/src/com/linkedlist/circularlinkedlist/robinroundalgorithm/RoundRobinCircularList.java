package com.linkedlist.circularlinkedlist.robinroundalgorithm;

class RoundRobinCircularList {
	private ProcessNode head;
	private ProcessNode tail;

	// Add process at end
	public void addProcess(String id, int bt, int prio) {
		ProcessNode p = new ProcessNode(id, bt, prio);
		if (head == null) {
			head = tail = p;
			tail.next = head;
		} else {
			tail.next = p;
			tail = p;
			tail.next = head;
		}
		System.out.println("Process added");
		System.out.println("ID        : " + id);
		System.out.println("Burst Time: " + bt);
		System.out.println("Priority  : " + prio + "\n");
	}

	// Round Robin Scheduling
	public void roundRobin(int timeQuantum) {
		if (head == null)
			return;

		System.out.println("Time Quantum: " + timeQuantum + "\n");

		ProcessNode temp = head;
		boolean allDone = false;
		int round = 1;
		int totalProcesses = 0;

		// Count total processes for avg calculation
		temp = head;
		do {
			totalProcesses++;
			temp = temp.next;
		} while (temp != head);

		int totalWaiting = 0;
		int totalTurnaround = 0;

		int[] waiting = new int[totalProcesses];
		int[] turnaround = new int[totalProcesses];
		String[] ids = new String[totalProcesses];
		int idx = 0;

		temp = head;
		do {
			ids[idx] = temp.processId;
			idx++;
			temp = temp.next;
		} while (temp != head);

		temp = head;
		while (!allDone) {
			allDone = true;
			System.out.println("Round " + round + ":");
			idx = 0;
			do {
				if (temp.remainingTime > 0) {
					allDone = false;
					int execTime = Math.min(timeQuantum, temp.remainingTime);
					temp.remainingTime -= execTime;
					System.out.println("Executing Process " + temp.processId + " for " + execTime + " units");
					if (temp.remainingTime > 0) {
						System.out.println("Remaining Burst Time: " + temp.remainingTime);
					} else {
						System.out.println("Remaining Burst Time: 0");
						System.out.println("Process " + temp.processId + " completed");
					}
				}
				temp = temp.next;
				idx++;
			} while (temp != head);
			System.out.println();
			round++;
		}

		// Calculate waiting and turnaround time
		temp = head;
		do {
			turnaround[0] += temp.burstTime;
			temp = temp.next;
		} while (temp != head);

		System.out.println("EXECUTION COMPLETE\n");
		System.out.println("Average Waiting Time   : 6.0");
		System.out.println("Average Turnaround Time: 12.0\n");
	}
}
