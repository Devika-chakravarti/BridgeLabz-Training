/*Read a CSV File and Print Data
Read a CSV file containing student details (ID, Name, Age, Marks).
Print each record in a structured format.
*/

package com.csvdatahandling;

import java.io.*;

public class ReadStudentCSV {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("students.csv"))) {
			String line;

			// Read each line of the CSV
			while ((line = br.readLine()) != null) {
				// Split line into columns
				String[] columns = line.split(",");

				// Print each record in structured format
				System.out.println("ID: " + columns[0] + ", Name: " + columns[1] + ", Age: " + columns[2] + ", Marks: "
						+ columns[3]);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
