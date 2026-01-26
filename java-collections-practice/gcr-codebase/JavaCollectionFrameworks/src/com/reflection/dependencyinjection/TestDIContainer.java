/*Dependency Injection using Reflection: Implement a simple DI container that scans classes with @Inject annotation and injects dependencies dynamically.
*/

package com.reflection.dependencyinjection;

public class TestDIContainer {

	public static void main(String[] args) throws Exception {

		Client client = new Client();

		// Inject dependencies
		SimpleDIContainer.initialize(client);

		// Call method to verify injection
		client.doWork();
	}
}
