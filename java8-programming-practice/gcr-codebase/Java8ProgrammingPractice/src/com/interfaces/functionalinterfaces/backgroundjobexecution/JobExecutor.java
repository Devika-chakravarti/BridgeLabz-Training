/*Background Job Execution
○ Scenario: Execute tasks asynchronously.
○ Task: Use Runnable functional interface.*/

package com.interfaces.functionalinterfaces.backgroundjobexecution;

public class JobExecutor {
	public static void main(String[] args) {

		System.out.println("Main thread: " + Thread.currentThread().getName());

		Runnable task = BackgroundJob.createTask("Data Sync Job");

		Thread worker = new Thread(task);
		worker.start();
	}
}
