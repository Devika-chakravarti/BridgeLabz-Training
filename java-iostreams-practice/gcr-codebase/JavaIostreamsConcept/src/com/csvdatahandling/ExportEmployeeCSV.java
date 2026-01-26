/*Generate a CSV Report from Database
Fetch employee records from a database and write them into a CSV file.
Include headers: Employee ID, Name, Department, Salary.
*/

package com.csvdatahandling;

import java.io.*;
import java.sql.*;

public class ExportEmployeeCSV {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/company"; // Database URL
		String user = "root"; // DB username
		String password = "password"; // DB password
		String outputFile = "employee_report.csv";

		try (Connection conn = DriverManager.getConnection(url, user, password);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT id, name, department, salary FROM employees");
				BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

			// Write CSV header
			bw.write("Employee ID,Name,Department,Salary\n");

			// Write each database row to CSV
			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				String department = rs.getString("department");
				String salary = rs.getString("salary");

				bw.write(id + "," + name + "," + department + "," + salary + "\n");
			}

			System.out.println("CSV report generated successfully!");

		} catch (SQLException e) {
			e.printStackTrace(); // Handle database errors
		} catch (IOException e) {
			e.printStackTrace(); // Handle file write errors
		}
	}
}
