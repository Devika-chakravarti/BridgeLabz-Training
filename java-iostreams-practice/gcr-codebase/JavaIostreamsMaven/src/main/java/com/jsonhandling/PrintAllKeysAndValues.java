// Read a JSON file and print all keys and values.

package com.jsonhandling;

import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PrintAllKeysAndValues {
	public static void main(String[] args) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			InputStream jsonStream = PrintAllKeysAndValues.class.getClassLoader().getResourceAsStream("user.json");

			if (jsonStream == null) {
				System.out.println("user.json not found");
				return;
			}

			JsonNode rootNode = mapper.readTree(jsonStream);

			Iterator<Map.Entry<String, JsonNode>> fields = rootNode.fields();
			while (fields.hasNext()) {
				Map.Entry<String, JsonNode> field = fields.next();
				String key = field.getKey();
				JsonNode value = field.getValue();

				if (value.isObject()) {
					System.out.println(key + " : " + value.toString());
				} else {
					System.out.println(key + " : " + value.asText());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
