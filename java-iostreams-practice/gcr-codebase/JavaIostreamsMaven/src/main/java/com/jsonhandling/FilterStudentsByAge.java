//Parse JSON and filter only those records where age > 25.

package com.jsonhandling;

import java.io.InputStream;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FilterStudentsByAge {
	public static void main(String[] args) {
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			InputStream jsonStream = FilterStudentsByAge.class.getClassLoader().getResourceAsStream("students.json");

			if (jsonStream == null) {
				System.out.println("students.json not found in resources folder");
				return;
			}

			JsonNode rootNode = objectMapper.readTree(jsonStream);

			for (JsonNode studentNode : rootNode) {
				int age = studentNode.get("age").asInt();

				if (age > 25) {
					System.out.println("Name: " + studentNode.get("name").asText());
					System.out.println("Age: " + age);
					System.out.println();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
