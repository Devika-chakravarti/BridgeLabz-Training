/*Sort a Stack Using Recursion
Problem: Given a stack, sort its elements in ascending order using recursion.
Hint: Pop elements recursively, sort the remaining stack, and insert the popped element back at the correct position.
*/

package com.stacksandqueues;

import java.util.Stack;

public class SortingStackUsingRecursion {

	// Sort the entire stack
	public static void sortStack(Stack<Integer> stack) {

		// Base case
		if (stack.isEmpty()) {
			return;
		}

		// remove top
		int top = stack.pop();
		// sort remaining stack
		sortStack(stack);
		insertInSortedOrder(stack, top);
	}

	// Insert element so that stack becomes descending
	private static void insertInSortedOrder(Stack<Integer> stack, int value) {

		if (stack.isEmpty() || stack.peek() >= value) {
			stack.push(value);
			return;
		}

		int temp = stack.pop();
		insertInSortedOrder(stack, value);
		stack.push(temp);
	}

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();

		stack.push(3);
		stack.push(1);
		stack.push(4);
		stack.push(2);

		sortStack(stack);

		// Now pop gives ascending order
		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
	}
}
