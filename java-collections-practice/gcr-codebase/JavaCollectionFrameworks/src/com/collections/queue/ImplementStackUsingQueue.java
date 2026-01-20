/*Implement a Stack Using Queues
Implement a stack data structure using two queues and support push, pop, and top operations.
Example:
Push 1, 2, 3 → Pop → Output: 3.
*/

package com.collections.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class StackUsingQueues {
	private Queue<Integer> q1 = new LinkedList<>();
	private Queue<Integer> q2 = new LinkedList<>();

	// push lements to stack
	public void push(int x) {
		// add to empty queue q2
		q2.add(x);

		// move all elements from q1 to q2
		while (!q1.isEmpty()) {
			q2.add(q1.remove());
		}

		// swap q1 and q2
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;
	}

	// pop element from stack
	public int pop() {
		if (q1.isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		return q1.remove();
	}

	// top element of stack
	public int top() {
		if (q1.isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		return q1.peek();
	}

	// check if stack is empty
	public boolean isEmpty() {
		return q1.isEmpty();
	}
}

public class ImplementStackUsingQueue {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		StackUsingQueues stack = new StackUsingQueues();

		System.out.print("Enter the number of operations: ");
		int n = input.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Enter operation (push num/pop/top) ");
			String op = input.next();

			if (op.equalsIgnoreCase("push")) {
				int value = input.nextInt();
				stack.push(value);
				System.out.println("Pushed: " + value);
			} else if (op.equalsIgnoreCase("pop")) {
				try {
					int popped = stack.pop();
					System.out.println("Popped: " + popped);
				} catch (RuntimeException e) {
					System.out.println(e.getMessage());
				}
			} else if (op.equalsIgnoreCase("top")) {
				try {
					System.out.println("Top: " + stack.top());
				} catch (RuntimeException e) {
					System.out.println(e.getMessage());
				}
			} else {
				System.out.println("Invalid operation");
			}
		}
	}
}
