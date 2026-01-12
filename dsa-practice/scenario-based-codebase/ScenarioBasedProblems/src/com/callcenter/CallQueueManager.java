package com.callcenter;

public class CallQueueManager {

	private static final int SIZE = 100;

	private int[] normalQueue = new int[SIZE];
	private int frontNormal = 0;
	private int rearNormal = 0;

	private int[] vipQueue = new int[SIZE];
	private int frontVip = 0;
	private int rearVip = 0;

	public void addCall(int customerId, boolean isVip) {
		if (isVip) {
			vipQueue[rearVip] = customerId;
			rearVip++;
			System.out.println("Call added to VIP queue successfully.");
		} else {
			normalQueue[rearNormal] = customerId;
			rearNormal++;
			System.out.println("Call added to normal queue successfully.");
		}
	}

	public int attendNextCall() {
		if (frontVip < rearVip) {
			int customerId = vipQueue[frontVip];
			frontVip++;
			return customerId;
		} else if (frontNormal < rearNormal) {
			int customerId = normalQueue[frontNormal];
			frontNormal++;
			return customerId;
		}
		return -1; 
	}

	public boolean hasVip() {
		return frontVip < rearVip;
	}

	public void displayVipQueue() {
		if (frontVip == rearVip) {
			System.out.println("VIP queue is empty.");
			return;
		}

		System.out.println("\n========== VIP CUSTOMER QUEUE ==========");
		for (int i = frontVip; i < rearVip; i++) {
			System.out.println("Customer ID: " + vipQueue[i]);
		}
	}

	public void displayNormalQueue() {
		if (frontNormal == rearNormal) {
			System.out.println("Normal queue is empty.");
			return;
		}

		System.out.println("\n========== NORMAL CALL QUEUE ==========");
		for (int i = frontNormal; i < rearNormal; i++) {
			System.out.println((i - frontNormal + 1) + ". Customer ID: " + normalQueue[i]);
		}
	}
}
