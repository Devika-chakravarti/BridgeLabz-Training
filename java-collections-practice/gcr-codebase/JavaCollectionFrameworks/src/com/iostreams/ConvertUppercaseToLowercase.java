/*Filter Streams - Convert Uppercase to Lowercase
📌 Problem Statement:
Create a program that reads a text file and writes its contents into another file, converting all uppercase letters to lowercase.
Requirements:
Use FileReader and FileWriter.
Use BufferedReader and BufferedWriter for efficiency.
Handle character encoding issues.
*/

package com.iostreams;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ConvertUppercaseToLowercase {

	public static void main(String[] args) {

		File inputFile = new File("input.txt");
		File outputFile = new File("output.txt");

		if (!inputFile.exists()) {
			System.out.println("Input file does not exist.");
			return;
		}

		try (
				// Reader with charset handling
				BufferedReader br = new BufferedReader(new FileReader(inputFile, StandardCharsets.UTF_8));

				// Writer with charset handling
				BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile, StandardCharsets.UTF_8))) {
			int ch;

			// Read characters, convert to lowercase, write to file
			while ((ch = br.read()) != -1) {
				bw.write(Character.toLowerCase((char) ch));
			}

			System.out.println("File converted successfully");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
