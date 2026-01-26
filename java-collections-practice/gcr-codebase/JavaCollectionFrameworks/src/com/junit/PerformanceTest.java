/*Performance Testing Using @Timeout
Problem:
Create a method longRunningTask() that sleeps for 3 seconds before returning a result.
Use @Timeout(2) in JUnit to fail the test if the method takes more than 2 seconds.
*/

package com.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class PerformanceTest {

	// method that takes long time to execute
	String longRunningTask() throws InterruptedException {

		// simulate long task (3 seconds)
		Thread.sleep(3000);

		return "Task Completed";
	}

	@Test
	@Timeout(2) // test fails if execution exceeds 2 seconds
	void testLongRunningTask() throws InterruptedException {

		longRunningTask();
	}
}
