package com.linkedlist.circularlinkedlist.robinroundalgorithm;

public class UseRoundRobinAlgorithm {
	public static void main(String[] args) {

		RoundRobinCircularList rr = new RoundRobinCircularList();

		System.out.println("========================================");
		System.out.println("       ROUND-ROBIN CPU SCHEDULING");
		System.out.println("========================================\n");

		System.out.println("----------------------------------------");
		System.out.println("OPERATION 1: ADD PROCESSES");
		System.out.println("----------------------------------------");
		rr.addProcess("P1", 10, 1);
		rr.addProcess("P2", 4, 2);
		rr.addProcess("P3", 6, 3);

		System.out.println("----------------------------------------");
		System.out.println("OPERATION 2: ROUND ROBIN EXECUTION");
		System.out.println("----------------------------------------");
		rr.roundRobin(4);
	}
}
