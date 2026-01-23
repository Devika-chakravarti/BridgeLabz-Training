/*File Handling - Read and Write a Text File
Problem Statement:
Write a Java program that reads the contents of a text file and writes it into a new file. If the source file does not exist, display an appropriate message.
Requirements:
Use FileInputStream and FileOutputStream.
Handle IOException properly.
Ensure that the destination file is created if it does not exist.
*/

package com.iostreams;

import java.io.*;

public class ReadWriteTextFile {
	public static void main(String args[]) {
		File sourceFile = new File("input.txt");
		File destinationFile = new File("output.txt");

		if (!sourceFile.exists()) {
			System.out.println("Source file doesn't exist");
			return;
		}

		try (FileInputStream fis = new FileInputStream(sourceFile);
				FileOutputStream fos = new FileOutputStream(destinationFile)) {
			int byteData;
			while ((byteData = fis.read()) != -1) {
				fos.write(byteData);
			}
			System.out.println("File copied successfully");
		} catch (IOException e) {
			System.out.println("Error while reading writing the file");
			e.printStackTrace();
		}
	}
}
