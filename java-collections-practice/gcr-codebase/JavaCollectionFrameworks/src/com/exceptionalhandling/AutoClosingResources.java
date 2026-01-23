/*Problem Statement:
Write a Java program that reads the first line of a file named "info.txt" using BufferedReader.
Use try-with-resources to ensure the file is automatically closed after reading.
Handle any IOException that may occur.*/

package com.exceptionalhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AutoClosingResources {
	public static void main(String args[]) {
		
		// try with resource i.e. BufferedReader
		try (BufferedReader reader = new BufferedReader(new FileReader("info.txt"))) {
			String line = reader.readLine();
			if (line != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("Error reading file");
		}
	}
}
