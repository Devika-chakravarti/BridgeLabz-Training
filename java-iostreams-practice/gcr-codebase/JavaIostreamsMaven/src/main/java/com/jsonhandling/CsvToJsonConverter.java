// Convert CSV data into JSON.

package com.jsonhandling;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.fasterxml.jackson.databind.MappingIterator;

public class CsvToJsonConverter {
	public static void main(String[] args) {
		try {
			InputStream csvInput = CsvToJsonConverter.class.getClassLoader().getResourceAsStream("students.csv");
			if (csvInput == null) {
				System.out.println("students.csv not found in resources folder");
				return;
			}

			CsvMapper csvMapper = new CsvMapper();
			CsvSchema schema = CsvSchema.emptySchema().withHeader();

			MappingIterator<Map<String, String>> iterator = csvMapper.readerFor(Map.class).with(schema)
					.readValues(csvInput);

			List<Map<String, String>> csvData = new ArrayList<>();
			iterator.forEachRemaining(csvData::add);

			ObjectMapper jsonMapper = new ObjectMapper();
			String jsonOutput = jsonMapper.writerWithDefaultPrettyPrinter().writeValueAsString(csvData);

			System.out.println(jsonOutput);

			jsonMapper.writeValue(new File("students.json"), csvData);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
