package com.interfaces.functionalinterfaces.backgroundjobexecution;

public class BackgroundJob {
	static Runnable createTask(String jobName) {
		return () -> {
			System.out.println(jobName + " is running in " + Thread.currentThread().getName());
		};
	}
}
