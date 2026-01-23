/* Read a Large File Line by Line
📌 Problem Statement:
Develop a Java program that efficiently reads a large text file (500MB+) line by line and prints only lines containing the word "error".
Requirements:
Use BufferedReader for efficient reading.
Read line-by-line instead of loading the entire file.
Display only lines containing "error" (case insensitive).
*/

package com.iostreams;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ReadLargeFileLineByLine {

	public static void main(String[] args) {

		File file = new File("largefile.txt");

		if (!file.exists()) {
			System.out.println("File does not exist.");
			return;
		}

		try (
				// BufferedReader for efficient line-by-line reading
				BufferedReader br = new BufferedReader(
						new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8))) {
			String line;

			// Read file line by line
			while ((line = br.readLine()) != null) {

				// Case-insensitive check for "error"
				if (line.toLowerCase().contains("error")) {
					System.out.println(line);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
