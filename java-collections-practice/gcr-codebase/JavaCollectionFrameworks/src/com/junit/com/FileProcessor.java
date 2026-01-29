package com.junit.com;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor {

	// writes content to a file
	public void writeToFile(String filename, String content) throws IOException {
		FileWriter writer = new FileWriter(filename);
		writer.write(content);
		writer.close();
	}

	// reads content from a file
	public String readFromFile(String filename) throws IOException {
		FileReader reader = new FileReader(filename);
		StringBuilder data = new StringBuilder();
		int ch;

		while ((ch = reader.read()) != -1) {
			data.append((char) ch);
		}

		reader.close();
		return data.toString();
	}

	// optional helper to check if file exists
	public boolean fileExists(String filename) {
		File file = new File(filename);
		return file.exists();
	}
}
