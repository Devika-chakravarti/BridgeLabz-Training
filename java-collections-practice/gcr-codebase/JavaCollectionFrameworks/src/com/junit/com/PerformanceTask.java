/*Performance Testing Using @Timeout
Problem:
Create a method longRunningTask() that sleeps for 3 seconds before returning a result.
Use @Timeout(2) in JUnit to fail the test if the method takes more than 2 seconds.
*/

package com.junit.com;

public class PerformanceTask {
	// method that takes long time to execute
	public String longRunningTask() throws InterruptedException {
		Thread.sleep(3000);
		return "Task Completed";
	}
}
