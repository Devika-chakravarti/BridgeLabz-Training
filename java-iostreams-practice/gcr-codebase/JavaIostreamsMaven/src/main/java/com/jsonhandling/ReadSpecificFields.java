// Read a JSON file and extract only specific fields (e.g., name, email).

package com.jsonhandling;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;

public class ReadSpecificFields {
	public static void main(String[] args) {
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			InputStream inputStream = ReadSpecificFields.class.getClassLoader().getResourceAsStream("user.json");

			JsonNode rootNode = objectMapper.readTree(inputStream);

			String name = rootNode.get("name").asText();
			String email = rootNode.get("email").asText();

			System.out.println("Name  : " + name);
			System.out.println("Email : " + email);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
