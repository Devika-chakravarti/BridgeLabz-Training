/*Implement a Queue Using Stacks
Problem: Design a queue using two stacks such that enqueue and dequeue operations are performed efficiently.
Hint: Use one stack for enqueue and another stack for dequeue. Transfer elements between stacks as needed.
*/

package com.stacksandqueues;

import java.util.Stack;

public class QueueImplementationUsingStack {

	// for enqueue
	private Stack<Integer> inStack = new Stack<>();
	// for dequeue
	private Stack<Integer> outStack = new Stack<>();

	// Add element to queue
	public void enqueue(int data) {
		// simple push
		inStack.push(data);
	}

	// Remove element from queue
	public int dequeue() {

		// If both stacks are empty → queue underflow
		if (inStack.isEmpty() && outStack.isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}

		// Transfer only when outStack is empty
		if (outStack.isEmpty()) {
			while (!inStack.isEmpty()) {
				outStack.push(inStack.pop());
			}
		}
		// FIFO order maintained
		return outStack.pop();
	}

	// Peek front element
	public int peek() {

		if (inStack.isEmpty() && outStack.isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}

		if (outStack.isEmpty()) {
			while (!inStack.isEmpty()) {
				outStack.push(inStack.pop());
			}
		}

		return outStack.peek();
	}

	// Check if queue is empty
	public boolean isEmpty() {
		return inStack.isEmpty() && outStack.isEmpty();
	}

	public static void main(String[] args) {
		QueueImplementationUsingStack queue = new QueueImplementationUsingStack();

		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);

		System.out.println(queue.dequeue());
		System.out.println(queue.peek());
		System.out.println(queue.dequeue());
	}
}
