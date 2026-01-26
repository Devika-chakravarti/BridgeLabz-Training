package com.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class FileProcessorTest {

	FileProcessor processor;
	String fileName = "testFile.txt";

	@BeforeEach
	void setup() {
		processor = new FileProcessor();
	}

	// ---------- TEST 1: Write and Read Content ----------
	@Test
	void testWriteAndReadFile() throws IOException {

		String content = "Hello JUnit";

		// write content to file
		processor.writeToFile(fileName, content);

		// read content from file
		String result = processor.readFromFile(fileName);

		// verify content
		assertEquals(content, result);
	}

	// ---------- TEST 2: Check File Exists ----------
	@Test
	void testFileExistsAfterWrite() throws IOException {

		processor.writeToFile(fileName, "File check");

		File file = new File(fileName);

		// verify file existence
		assertTrue(file.exists());
	}

	// ---------- TEST 3: Handle IOException ----------
	@Test
	void testReadFileNotFound() {

		try {
			processor.readFromFile("nofile.txt");
			fail("IOException should be thrown");
		} catch (IOException e) {
			// exception expected
			assertTrue(true);
		}
	}
}

/* ===================== MAIN CLASS ===================== */

class FileProcessor {

	// writes content to a file
	void writeToFile(String filename, String content) throws IOException {

		FileWriter writer = new FileWriter(filename);
		writer.write(content);
		writer.close();
	}

	// reads content from a file
	String readFromFile(String filename) throws IOException {

		FileReader reader = new FileReader(filename);
		StringBuilder data = new StringBuilder();
		int ch;

		while ((ch = reader.read()) != -1) {
			data.append((char) ch);
		}

		reader.close();
		return data.toString();
	}
}
