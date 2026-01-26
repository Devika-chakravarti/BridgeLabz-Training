package com.annotation.taskinfo;

import java.lang.reflect.Method;

public class TaskManager {

	@TaskInfo(priority = "High", assignedTo = "Devika")
	public void completeTask() {
		System.out.println("Task is being completed");
	}

	public static void main(String[] args) throws Exception {

		TaskManager manager = new TaskManager();

		// Getting Method object using reflection
		Method method = manager.getClass().getMethod("completeTask");

		// Checking if annotation is present
		if (method.isAnnotationPresent(TaskInfo.class)) {

			// Reading annotation values
			TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);

			System.out.println("Priority: " + taskInfo.priority());
			System.out.println("Assigned To: " + taskInfo.assignedTo());
		}

		manager.completeTask();
	}
}
