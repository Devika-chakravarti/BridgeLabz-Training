package com.annotation.customannotations.importantmethod;

import java.lang.reflect.Method;

public class TaskHandler {

	@ImportantMethod(level = "HIGH")
	public void criticalTask() {
		System.out.println("Executing critical task!");
	}

	@ImportantMethod(level = "MEDIUM")
	public void mediumTask() {
		System.out.println("Executing medium priority task!");
	}

	public void normalTask() {
		System.out.println("Executing normal task!");
	}

	public static void main(String[] args) {

		TaskHandler handler = new TaskHandler();

		for (Method method : handler.getClass().getDeclaredMethods()) {

			// Check if method has ImportantMethod annotation
			if (method.isAnnotationPresent(ImportantMethod.class)) {

				ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);

				System.out.println("Method: " + method.getName() + ", Level: " + annotation.level());
			}
		}

		handler.criticalTask();
		handler.mediumTask();
		handler.normalTask();
	}
}
