package com.searchingalgorithmandother.inputstreamreader;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class WriteUserInputToFile {

	public static void main(String[] args) {
		String filePath = "output.txt";

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				FileWriter writer = new FileWriter(filePath, true)) {
			String line;

			while (true) {
				line = br.readLine();
				if (line.equalsIgnoreCase("exit")) {
					break;
				}
				writer.write(line + System.lineSeparator());
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
