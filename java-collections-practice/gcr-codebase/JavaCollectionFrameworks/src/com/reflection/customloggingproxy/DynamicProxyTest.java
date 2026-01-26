/*Custom Logging Proxy Using Reflection: Implement a Dynamic Proxy that intercepts method calls on an interface (e.g., Greeting.sayHello()) and logs the method name before executing it.
*/

package com.reflection.customloggingproxy;

import java.lang.reflect.Proxy;

public class DynamicProxyTest {

	public static void main(String[] args) {

		// Original object
		Greeting greeting = new Hello();

		// Create proxy instance
		Greeting proxyInstance = (Greeting) Proxy.newProxyInstance(Hello.class.getClassLoader(),
				new Class[] { Greeting.class }, new LoggingInvocationHandler(greeting));

		// Call method via proxy
		proxyInstance.sayHello();
	}
}
