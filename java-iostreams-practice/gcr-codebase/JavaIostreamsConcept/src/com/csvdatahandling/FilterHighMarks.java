/* Filter Records from CSV
Read a CSV file and filter students who have scored more than 80 marks.
Print only the qualifying records.
*/

package com.csvdatahandling;

import java.io.*;

public class FilterHighMarks {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("students.csv"))) {
			String line;

			// Read each row of CSV
			while ((line = br.readLine()) != null) {
				String[] columns = line.split(",");
				int marks = Integer.parseInt(columns[3]);

				// Filter students with marks > 80
				if (marks > 80) {
					System.out.println("ID: " + columns[0] + ", Name: " + columns[1] + ", Age: " + columns[2]
							+ ", Marks: " + columns[3]);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
