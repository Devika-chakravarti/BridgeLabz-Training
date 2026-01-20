/*Reverse a Queue
Reverse the elements of a queue using only queue operations (e.g., add, remove, isEmpty).
Example:
Input: [10, 20, 30] → Output: [30, 20, 10].
*/

package com.collections.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ReverseQueue {

	// recursive method to reverse queue
	public static void reverseQueue(Queue<Integer> queue) {
		if (queue.isEmpty()) {
			return;
		}
		// remove front
		int front = queue.remove();
		// reverse remaining
		reverseQueue(queue);
		// add at end
		queue.add(front);
	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		Queue<Integer> queue = new LinkedList<>();

		System.out.print("Enter the number of elements: ");
		int n = input.nextInt();

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			queue.add(input.nextInt());
		}

		reverseQueue(queue);

		System.out.println("Reversed queue: " + queue);
	}
}
