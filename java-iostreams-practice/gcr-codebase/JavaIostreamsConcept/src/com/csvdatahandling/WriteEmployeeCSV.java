/* Write Data to a CSV File
Create a CSV file with employee details (ID, Name, Department, Salary).
Write at least 5 records to the file.
*/

package com.csvdatahandling;

import java.io.*;

public class WriteEmployeeCSV {
	public static void main(String[] args) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("employees.csv"))) {
			// Write header row
			writer.write("ID,Name,Department,Salary\n");

			// Write at least 5 employee records
			writer.write("101,Devika,Engineering,70000\n");
			writer.write("102,Annu,HR,50000\n");
			writer.write("103,Satya,Marketing,55000\n");
			writer.write("104,Shilpa,Finance,62000\n");
			writer.write("105,Suraj,Sales,58000\n");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
