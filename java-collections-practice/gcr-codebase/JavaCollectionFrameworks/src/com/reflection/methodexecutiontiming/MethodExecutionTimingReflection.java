/*Method Execution Timing: Use Reflection to measure the execution time of methods in a given class dynamically.
*/

package com.reflection.methodexecutiontiming;

import java.lang.reflect.Method;

public class MethodExecutionTimingReflection {
	public static void main(String[] args) throws Exception {

		TaskManager taskManager = new TaskManager();

		// Get Class object
		Class<?> cls = taskManager.getClass();

		for (Method method : cls.getDeclaredMethods()) {

			// Record start time
			long startTime = System.nanoTime();

			// Invoke method dynamically
			method.invoke(taskManager);

			// Record end time
			long endTime = System.nanoTime();

			// Calculate and display execution time
			System.out.println("Method: " + method.getName() + " executed in " + (endTime - startTime) + " ns");
		}
	}
}
