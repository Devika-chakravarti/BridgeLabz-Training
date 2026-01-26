/*Detect Duplicates in a CSV File
Read a CSV file and detect duplicate entries based on the ID column.
Print all duplicate records.
*/

package com.csvdatahandling;

import java.io.*;
import java.util.*;

public class DetectDuplicatesCSV {
	public static void main(String[] args) {
		String filePath = "students.csv";
		Set<String> uniqueIDs = new HashSet<>();
		List<String> duplicates = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			br.readLine();

			while ((line = br.readLine()) != null) {
				String[] columns = line.split(",");
				String id = columns[0];

				// If ID already exists, it's a duplicate
				if (!uniqueIDs.add(id)) {
					duplicates.add(line);
				}
			}

			// Print all duplicate records
			if (duplicates.isEmpty()) {
				System.out.println("No duplicates found.");
			} else {
				System.out.println("Duplicate records:");
				for (String dup : duplicates) {
					System.out.println(dup);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
