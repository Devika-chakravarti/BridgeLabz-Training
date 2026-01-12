package com.texteditor;

public class CustomStack {

	private static final int SIZE = 100;

	// Stack array to store actions
	private Action[] stack = new Action[SIZE];

	// Top pointer
	private int top = -1;

	// Push action onto stack
	public void push(Action action) {
		if (top == SIZE - 1) {
			System.out.println("Stack overflow.");
			return;
		}
		stack[++top] = action;
	}

	// Pop action from stack
	public Action pop() {
		if (top == -1) {
			return null;
		}
		return stack[top--];
	}

	// Check if stack is empty
	public boolean isEmpty() {
		return top == -1;
	}

	// Clear stack (used when new action occurs)
	public void clear() {
		top = -1;
	}
}
