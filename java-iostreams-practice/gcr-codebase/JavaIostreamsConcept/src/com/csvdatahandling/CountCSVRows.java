/*Read and Count Rows in a CSV File
Read a CSV file and count the number of records (excluding the header row).
*/

package com.csvdatahandling;

import java.io.*;

public class CountCSVRows {
	public static void main(String[] args) {
		int count = 0; // To store number of records

		try (BufferedReader br = new BufferedReader(new FileReader("students.csv"))) {
			br.readLine();

			// Count each record
			while (br.readLine() != null) {
				count++;
			}

			System.out.println(count);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
