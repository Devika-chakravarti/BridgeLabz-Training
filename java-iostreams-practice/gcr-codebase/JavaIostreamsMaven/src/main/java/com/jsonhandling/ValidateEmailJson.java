package com.jsonhandling;

import java.io.InputStream;
import java.util.Set;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;
import com.networknt.schema.ValidationMessage;

public class ValidateEmailJson {
	public static void main(String[] args) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			JsonNode json = mapper.readTree(ValidateEmailJson.class.getClassLoader().getResourceAsStream("user.json"));
			JsonNode schemaNode = mapper
					.readTree(ValidateEmailJson.class.getClassLoader().getResourceAsStream("schema.json"));

			JsonSchema schema = JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V7).getSchema(schemaNode);

			Set<ValidationMessage> errors = schema.validate(json);
			if (errors.isEmpty()) {
				System.out.println("JSON is valid.");
			} else {
				System.out.println("JSON validation failed:");
				errors.forEach(error -> {
					System.out.println(error.getMessage());
				});
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
