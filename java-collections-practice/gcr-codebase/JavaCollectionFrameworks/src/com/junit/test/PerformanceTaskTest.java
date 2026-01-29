package com.junit.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import com.junit.com.PerformanceTask;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PerformanceTaskTest {
	private PerformanceTask task = new PerformanceTask();
	@Test
	@Timeout(2)
	void testLongRunningTask() throws InterruptedException {
		String result = task.longRunningTask();
		assertEquals("Task Completed", result);
	}
}
