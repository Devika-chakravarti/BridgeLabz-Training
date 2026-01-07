package com.searchingalgorithmandother.inputstreamreader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ReadFileUsingInputStreamReader {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter file path: ");
		String filePath = input.nextLine();

		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8))) {

			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}

		input.close();
	}
}
