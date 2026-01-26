package com.reflection.dependencyinjection;

import java.lang.reflect.Field;

public class SimpleDIContainer {

	public static void initialize(Object obj) throws Exception {
		Class<?> cls = obj.getClass();

		// Iterate over all fields
		for (Field field : cls.getDeclaredFields()) {

			// Check if field has @Inject annotation
			if (field.isAnnotationPresent(Inject.class)) {
				Class<?> fieldType = field.getType();

				// Create instance of the field type
				Object dependency = fieldType.getDeclaredConstructor().newInstance();

				field.setAccessible(true);

				// Inject dependency
				field.set(obj, dependency);
			}
		}
	}
}
