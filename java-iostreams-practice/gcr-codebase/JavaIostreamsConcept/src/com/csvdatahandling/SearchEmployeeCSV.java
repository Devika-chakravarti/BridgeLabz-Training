/* Search for a Record in CSV
Read an employees.csv file and search for an employee by name.
Print their department and salary.
*/

package com.csvdatahandling;

import java.io.*;

public class SearchEmployeeCSV {
	public static void main(String[] args) {
		String searchName = "Devika";

		try (BufferedReader br = new BufferedReader(new FileReader("employees.csv"))) {
			String line;

			while ((line = br.readLine()) != null) {
				String[] columns = line.split(",");
				String name = columns[1];

				if (name.equals(searchName)) {
					System.out.println("Department: " + columns[2] + ", Salary: " + columns[3]);
					break;
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
