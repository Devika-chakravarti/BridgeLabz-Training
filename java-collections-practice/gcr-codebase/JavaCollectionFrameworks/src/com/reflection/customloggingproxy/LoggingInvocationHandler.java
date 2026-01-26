package com.reflection.customloggingproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoggingInvocationHandler implements InvocationHandler {

	private final Object target;

	public LoggingInvocationHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		// Log method name before execution
		System.out.println("Executing method: " + method.getName());

		// Invoke the original method
		return method.invoke(target, args);
	}
}
