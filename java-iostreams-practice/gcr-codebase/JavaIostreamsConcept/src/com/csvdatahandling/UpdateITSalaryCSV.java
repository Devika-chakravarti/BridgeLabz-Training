/*Modify a CSV File (Update a Value)
Read a CSV file and increase the salary of employees from the "IT" department by 10%.
Save the updated records back to a new CSV file.
*/

package com.csvdatahandling;

import java.io.*;

public class UpdateITSalaryCSV {
	public static void main(String[] args) {
		String inputFile = "employees.csv";
		String outputFile = "updated_employees.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
				BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

			String line;
			// Read and write header first
			line = br.readLine();
			bw.write(line + "\n");

			while ((line = br.readLine()) != null) {
				String[] columns = line.split(",");
				String department = columns[2];
				double salary = Double.parseDouble(columns[3]);

				if (department.equals("IT")) {
					salary = salary + salary * 0.10;
				}

				// Write updated record to new CSV
				bw.write(columns[0] + "," + columns[1] + "," + department + "," + (int) salary + "\n");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
