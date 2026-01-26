package com.reflection.customloggingproxy;

public class Hello implements Greeting {

	@Override
	public void sayHello() {
		System.out.println("Hello, World!");
	}
}
