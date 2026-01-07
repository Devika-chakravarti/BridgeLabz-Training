package com.searchingalgorithmandother.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileLineByLine {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter file path: ");
		String filePath = input.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
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
