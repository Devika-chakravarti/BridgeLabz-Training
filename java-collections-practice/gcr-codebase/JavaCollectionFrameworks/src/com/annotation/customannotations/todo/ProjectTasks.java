package com.annotation.customannotations.todo;

import java.lang.reflect.Method;

public class ProjectTasks {

	@Todo(task = "Implement login functionality", assignedTo = "Devika", priority = "HIGH")
	public void loginFeature() {
		System.out.println("Login feature pending!");
	}

	@Todo(task = "Add user profile page", assignedTo = "Rahul")
	public void userProfileFeature() {
		System.out.println("User profile feature pending!");
	}

	public void completedFeature() {
		System.out.println("This feature is already done.");
	}

	public static void main(String[] args) {

		ProjectTasks project = new ProjectTasks();

		for (Method method : project.getClass().getDeclaredMethods()) {

			// Check if method has Todo annotation
			if (method.isAnnotationPresent(Todo.class)) {

				Todo todo = method.getAnnotation(Todo.class);

				System.out.println("Pending Task: " + todo.task() + ", Assigned To: " + todo.assignedTo()
						+ ", Priority: " + todo.priority());
			}
		}

		project.loginFeature();
		project.userProfileFeature();
		project.completedFeature();
	}
}
