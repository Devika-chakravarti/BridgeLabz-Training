/*Read Large CSV File Efficiently
Given a large CSV file (500MB+), implement a memory-efficient way to read it in chunks.
Process only 100 lines at a time and display the count of records processed.
*/

package com.csvdatahandling;

import java.io.*;

public class ReadLargeCSV {
	public static void main(String[] args) {
		String filePath = "large_file.csv";
		int chunkSize = 100; 
		int totalCount = 0;

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			// Counter for current chunk
			int chunkCount = 0; 

			while ((line = br.readLine()) != null) {
				chunkCount++;
				totalCount++;
				// When 100 lines are read, reset chunk
				if (chunkCount == chunkSize) {
					System.out.println("Processed " + totalCount + " records so far.");
					chunkCount = 0; 
				}
			}

			if (chunkCount > 0) {
				System.out.println("Processed " + totalCount + " records in total.");
			}

		} catch (IOException e) {
			e.printStackTrace(); 
		}
	}
}
