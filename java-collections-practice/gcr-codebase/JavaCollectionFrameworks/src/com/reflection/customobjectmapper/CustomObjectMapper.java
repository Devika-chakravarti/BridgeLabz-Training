package com.reflection.customobjectmapper;

import java.lang.reflect.Field;
import java.util.Map;

public class CustomObjectMapper {

	public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception {

		// Create instance using default constructor
		T obj = clazz.getDeclaredConstructor().newInstance();

		// Set values for each field present in the Map
		for (Map.Entry<String, Object> entry : properties.entrySet()) {
			String fieldName = entry.getKey();
			Object value = entry.getValue();

			try {
				Field field = clazz.getDeclaredField(fieldName);
				field.setAccessible(true);
				field.set(obj, value);
			} catch (NoSuchFieldException e) {
				// Ignore fields not present in the class
			}
		}

		return obj;
	}
}
