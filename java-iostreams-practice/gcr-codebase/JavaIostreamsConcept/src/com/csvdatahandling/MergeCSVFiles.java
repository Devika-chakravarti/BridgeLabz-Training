/*Merge Two CSV Files
You have two CSV files:
students1.csv (contains ID, Name, Age)
students2.csv (contains ID, Marks, Grade)
Merge both files based on ID and create a new file containing all details.*/

package com.csvdatahandling;

import java.io.*;
import java.util.*;

public class MergeCSVFiles {
	public static void main(String[] args) {
		String file1 = "students1.csv";
		String file2 = "students2.csv";
		String outputFile = "merged_students.csv";

		Map<String, String[]> map1 = new HashMap<>(); // Store ID -> [Name, Age]

		try (BufferedReader br1 = new BufferedReader(new FileReader(file1))) {
			// Read header (ID, Name, Age)
			String line = br1.readLine(); 
			// Store data from students1.csv
			while ((line = br1.readLine()) != null) {
				String[] columns = line.split(",");
				map1.put(columns[0], new String[] { columns[1], columns[2] });
			}

			try (BufferedReader br2 = new BufferedReader(new FileReader(file2));
					BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

				// Read header of students2.csv
				String header2 = br2.readLine(); 
				// Write new header
				bw.write("ID,Name,Age,Marks,Grade\n");

				// Merge based on ID
				while ((line = br2.readLine()) != null) {
					String[] columns = line.split(",");
					String id = columns[0];
					String marks = columns[1];
					String grade = columns[2];

					if (map1.containsKey(id)) {
						String[] data1 = map1.get(id);
						bw.write(id + "," + data1[0] + "," + data1[1] + "," + marks + "," + grade + "\n");
					}
				}

			} catch (IOException e) {
				e.printStackTrace(); 
			}

		} catch (IOException e) {
			e.printStackTrace(); 
		}
	}
}
