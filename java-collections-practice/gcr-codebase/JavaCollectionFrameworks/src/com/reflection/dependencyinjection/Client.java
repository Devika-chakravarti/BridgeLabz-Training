package com.reflection.dependencyinjection;

public class Client {

	@Inject
	private ServiceA serviceA;

	public void doWork() {
		serviceA.execute();
	}
}
