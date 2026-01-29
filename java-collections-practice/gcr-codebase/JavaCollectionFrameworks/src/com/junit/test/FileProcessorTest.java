package com.junit.test;

import com.junit.com.FileProcessor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FileProcessorTest {

	private FileProcessor processor;
	private String fileName = "testFile.txt";

	@BeforeEach
	void setup() {
		processor = new FileProcessor();
	}

	@Test
	void testWriteAndReadFile() throws IOException {
		String content = "Hello JUnit";

		processor.writeToFile(fileName, content);

		String result = processor.readFromFile(fileName);

		assertEquals(content, result);
	}

	@Test
	void testFileExistsAfterWrite() throws IOException {

		processor.writeToFile(fileName, "File check");

		assertTrue(processor.fileExists(fileName));
	}

	@Test
	void testReadFileNotFound() {

		assertThrows(IOException.class, () -> {
			processor.readFromFile("nofile.txt");
		});
	}
}
