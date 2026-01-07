package com.searchingalgorithmandother.challengeproblemone;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class CompareProgram {

	public static void main(String[] args) {

		int times = 1_000_000;
		String value = "hello";

		long startBuilder = System.nanoTime();
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < times; i++) {
			builder.append(value);
		}
		long endBuilder = System.nanoTime();

		long startBuffer = System.nanoTime();
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < times; i++) {
			buffer.append(value);
		}
		long endBuffer = System.nanoTime();

		System.out.println("StringBuilder time: " + (endBuilder - startBuilder) + " ns");
		System.out.println("StringBuffer time: " + (endBuffer - startBuffer) + " ns");

		String filePath = "largefile.txt";

		long startFileReader = System.nanoTime();
		int fileReaderWords = readUsingFileReader(filePath);
		long endFileReader = System.nanoTime();

		long startInputStreamReader = System.nanoTime();
		int inputStreamReaderWords = readUsingInputStreamReader(filePath);
		long endInputStreamReader = System.nanoTime();

		System.out.println("FileReader word count: " + fileReaderWords);
		System.out.println("FileReader time: " + (endFileReader - startFileReader) + " ns");

		System.out.println("InputStreamReader word count: " + inputStreamReaderWords);
		System.out.println("InputStreamReader time: " + (endInputStreamReader - startInputStreamReader) + " ns");
	}

	private static int readUsingFileReader(String filePath) {
		int count = 0;

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] words = line.split("\\s+");
				count += words.length;
			}
		} catch (IOException e) {
			System.out.println("FileReader error: " + e.getMessage());
		}

		return count;
	}

	private static int readUsingInputStreamReader(String filePath) {
		int count = 0;

		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8))) {

			String line;
			while ((line = br.readLine()) != null) {
				String[] words = line.split("\\s+");
				count += words.length;
			}
		} catch (IOException e) {
			System.out.println("InputStreamReader error: " + e.getMessage());
		}

		return count;
	}
}