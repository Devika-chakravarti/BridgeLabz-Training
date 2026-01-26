package com.annotation.customannotations.jsonfield;

import java.lang.reflect.Field;

public class JsonSerializer {

	public static String toJson(Object obj) {

		StringBuilder jsonBuilder = new StringBuilder();
		jsonBuilder.append("{");

		Field[] fields = obj.getClass().getDeclaredFields();
		boolean firstField = true;

		for (Field field : fields) {

			if (field.isAnnotationPresent(JsonField.class)) {

				if (!firstField) {
					jsonBuilder.append(", ");
				}

				JsonField jsonField = field.getAnnotation(JsonField.class);
				field.setAccessible(true);

				try {
					Object value = field.get(obj);
					jsonBuilder.append("\"").append(jsonField.name()).append("\": \"").append(value).append("\"");
					firstField = false;

				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}

		jsonBuilder.append("}");
		return jsonBuilder.toString();
	}

	public static void main(String[] args) {

		User user = new User("Devika", "devika@xyz.com", 25);

		String json = toJson(user);
		System.out.println(json);
		// Output: {"user_name": "Devika", "user_email": "devika@xyz.com"}
	}
}
