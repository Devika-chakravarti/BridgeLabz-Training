/*Sort CSV Records by a Column
Read a CSV file and sort the records by Salary in descending order.
Print the top 5 highest-paid employees.
*/

package com.csvdatahandling;

import java.io.*;
import java.util.*;

public class TopPaidEmployeesCSV {
	public static void main(String[] args) {
		List<String[]> employees = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader("employees.csv"))) {
			String line;
			String header = br.readLine(); 

			// Read each employee record
			while ((line = br.readLine()) != null) {
				String[] columns = line.split(","); 
				employees.add(columns);
			}

			// Sort by salary in descending order (simple comparator)
			Collections.sort(employees, new Comparator<String[]>() {
				public int compare(String[] a, String[] b) {
					return Integer.parseInt(b[3]) - Integer.parseInt(a[3]);
				}
			});

			System.out.println("Top 5 highest-paid employees:");
			for (int i = 0; i < Math.min(5, employees.size()); i++) {
				String[] emp = employees.get(i);
				System.out.println(
						"ID: " + emp[0] + ", Name: " + emp[1] + ", Department: " + emp[2] + ", Salary: " + emp[3]);
			}

		} catch (IOException e) {
			e.printStackTrace(); 
		}
	}
}
