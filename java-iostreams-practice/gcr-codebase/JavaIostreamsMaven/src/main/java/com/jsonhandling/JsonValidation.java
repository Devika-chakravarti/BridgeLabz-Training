// Validate JSON structure using Jackson.

package com.jsonhandling;

import java.io.InputStream;
import java.util.Set;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;
import com.networknt.schema.ValidationMessage;

public class JsonValidation {
	public static void main(String[] args) {
		try {
			ObjectMapper objectMapper = new ObjectMapper();

			InputStream jsonStream = JsonValidation.class.getClassLoader().getResourceAsStream("user.json");
			InputStream schemaStream = JsonValidation.class.getClassLoader().getResourceAsStream("schema.json");

			if (jsonStream == null || schemaStream == null) {
				System.out.println("JSON or Schema file not found");
				return;
			}

			JsonNode jsonNode = objectMapper.readTree(jsonStream);
			JsonNode schemaNode = objectMapper.readTree(schemaStream);

			JsonSchemaFactory factory = JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V7);
			JsonSchema schema = factory.getSchema(schemaNode);

			Set<ValidationMessage> errors = schema.validate(jsonNode);

			if (errors.isEmpty()) {
				System.out.println("JSON validation successful");
			} else {
				System.out.println("JSON validation failed");
				errors.forEach(error -> System.out.println(error.getMessage()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
