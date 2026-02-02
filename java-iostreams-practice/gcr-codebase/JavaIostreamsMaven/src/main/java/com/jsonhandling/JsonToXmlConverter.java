// Convert JSON to XML format.

package com.jsonhandling;

import java.io.File;
import java.io.InputStream;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class JsonToXmlConverter {
	public static void main(String[] args) {
		try {
			ObjectMapper jsonMapper = new ObjectMapper();
			XmlMapper xmlMapper = new XmlMapper();

			InputStream jsonStream = JsonToXmlConverter.class.getClassLoader().getResourceAsStream("user.json");

			if (jsonStream == null) {
				System.out.println("user.json not found");
				return;
			}

			JsonNode jsonNode = jsonMapper.readTree(jsonStream);

			String xml = xmlMapper.writer().withRootName("User").withDefaultPrettyPrinter()
					.writeValueAsString(jsonNode);

			System.out.println(xml);

			xmlMapper.writeValue(new File("user.xml"), jsonNode);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
