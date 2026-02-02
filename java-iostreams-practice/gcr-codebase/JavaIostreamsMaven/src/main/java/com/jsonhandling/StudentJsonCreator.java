// Create a JSON object for a Student with fields: name, age, and subjects (array).

package com.jsonhandling;

import org.json.JSONArray;
import org.json.JSONObject;

public class StudentJsonCreator {

	public static void main(String[] args) {

		JSONArray subjects = new JSONArray();
		subjects.put("Java");
		subjects.put("Data Structures");
		subjects.put("Database Management Systems");

		JSONObject student = new JSONObject();
		student.put("name", "Devika Chakravarti");
		student.put("age", 22);
		student.put("subjects", subjects);

		System.out.println(student.toString(2));
	}
}
