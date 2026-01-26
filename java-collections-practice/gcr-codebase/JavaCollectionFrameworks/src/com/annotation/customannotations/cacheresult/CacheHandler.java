package com.annotation.customannotations.cacheresult;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CacheHandler {

	private static Map<String, Object> cache = new HashMap<>();

	public static Object invokeWithCache(Object obj, String methodName, Object... args) throws Exception {

		Method method = obj.getClass().getMethod(methodName, int.class);

		String key = methodName + ":" + args[0];

		if (method.isAnnotationPresent(CacheResult.class)) {

			if (cache.containsKey(key)) {
				System.out.println("Returning cached result for " + args[0]);
				return cache.get(key);
			} else {
				Object result = method.invoke(obj, args);
				cache.put(key, result);
				return result;
			}

		} else {
			return method.invoke(obj, args);
		}
	}

	public static void main(String[] args) throws Exception {
		ExpensiveCalculator calculator = new ExpensiveCalculator();

		// First call - computes
		System.out.println("Factorial: " + invokeWithCache(calculator, "factorial", 5));

		// Second call - should return cached
		System.out.println("Factorial: " + invokeWithCache(calculator, "factorial", 5));

		// Different input - computes again
		System.out.println("Factorial: " + invokeWithCache(calculator, "factorial", 6));
	}
}
