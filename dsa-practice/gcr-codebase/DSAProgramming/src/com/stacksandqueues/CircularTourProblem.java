/*Circular Tour Problem
Problem: Given a set of petrol pumps with petrol and distance to the next pump, determine the starting point for completing a circular tour.
Hint: Use a queue to simulate the tour, keeping track of surplus petrol at each pump.
*/

package com.stacksandqueues;

import java.util.LinkedList;
import java.util.Queue;

public class CircularTourProblem {

	static class PetrolPump {
		int petrol;
		int distance;

		PetrolPump(int petrol, int distance) {
			this.petrol = petrol;
			this.distance = distance;
		}
	}

	public static int findStart(PetrolPump[] pumps) {

		Queue<Integer> queue = new LinkedList<>();
		int currPetrol = 0;
		int totalPetrol = 0;

		for (int i = 0; i < pumps.length; i++) {

			int balance = pumps[i].petrol - pumps[i].distance;
			totalPetrol += balance;
			currPetrol += balance;
			queue.offer(i);

			// If fuel becomes negative, reset
			if (currPetrol < 0) {
				queue.clear();
				currPetrol = 0;
			}
		}

		// If total petrol is insufficient
		if (totalPetrol < 0) {
			return -1;
		}

		// Front of queue is starting point
		return queue.peek();
	}

	public static void main(String[] args) {

		PetrolPump[] pumps = { new PetrolPump(6, 4), new PetrolPump(3, 6), new PetrolPump(7, 3) };

		System.out.println(findStart(pumps));
	}
}
