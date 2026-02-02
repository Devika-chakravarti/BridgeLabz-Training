// Merge two JSON objects into one.

package com.jsonhandling;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.InputStream;

public class MergeJsonObjects {

	public static void main(String[] args) {

		try {
			ObjectMapper objectMapper = new ObjectMapper();

			InputStream userStream = MergeJsonObjects.class.getClassLoader().getResourceAsStream("user.json");

			InputStream addressStream = MergeJsonObjects.class.getClassLoader().getResourceAsStream("address.json");

			JsonNode userNode = objectMapper.readTree(userStream);
			JsonNode addressNode = objectMapper.readTree(addressStream);

			ObjectNode mergedJson = objectMapper.createObjectNode();
			mergedJson.setAll((ObjectNode) userNode);
			mergedJson.setAll((ObjectNode) addressNode);

			System.out.println(mergedJson.toPrettyString());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
