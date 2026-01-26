package com.reflection.jsonrepresentation;

import java.lang.reflect.Field;

public class ObjectToJsonReflection {

	public static String toJson(Object obj) throws IllegalAccessException {
		StringBuilder jsonBuilder = new StringBuilder();
		Class<?> cls = obj.getClass();

		jsonBuilder.append("{");

		Field[] fields = cls.getDeclaredFields();

		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			field.setAccessible(true); 
			Object value = field.get(obj);

			jsonBuilder.append("\"").append(field.getName()).append("\": ");

			if (value instanceof String) {
				jsonBuilder.append("\"").append(value).append("\"");
			} else {
				jsonBuilder.append(value);
			}

			if (i < fields.length - 1) {
				jsonBuilder.append(", ");
			}
		}

		jsonBuilder.append("}");
		return jsonBuilder.toString();
	}
}
