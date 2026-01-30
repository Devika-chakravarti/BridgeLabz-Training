// Use lambda to run a task in a separate thread.

package com.lambdaexpression.basicsystemtask;

public class SeparateThread {
	public static void main(String args[]) {
		Thread t = new Thread(() -> {
			System.out.println("Task is running in a separate thread");
		});
		t.start();
	}
}
