/*Generate a JSON Representation: Write a program that converts an object to a JSON-like string using Reflection by inspecting its fields and values.
*/

package com.reflection.jsonrepresentation;

public class TestObjectToJsonReflection {

	public static class Person {
		private String name;
		private int age;
		private boolean active;

		public Person(String name, int age, boolean active) {
			this.name = name;
			this.age = age;
			this.active = active;
		}
	}

	public static void main(String[] args) throws Exception {

		Person person = new Person("Devika", 22, true);

		// Convert object to JSON-like string using Reflection
		String json = ObjectToJsonReflection.toJson(person);

		System.out.println(json);
	}
}
