package com.reflection.customobjectmapper;

import java.util.HashMap;
import java.util.Map;

public class TestCustomObjectMapper {

	public static class Person {
		private String name;
		private int age;

		public void display() {
			System.out.println("Name: " + name + ", Age: " + age);
		}
	}

	public static void main(String[] args) throws Exception {

		// Create a map with field values
		Map<String, Object> properties = new HashMap<>();
		properties.put("name", "Devika");
		properties.put("age", 22);

		// Create object dynamically and set fields
		Person person = CustomObjectMapper.toObject(Person.class, properties);

		// Display values to verify
		person.display();
	}
}
