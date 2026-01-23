/*Read User Input from Console
📌 Problem Statement:
Write a program that asks the user for their name, age, and favorite programming language, then saves this information into a file.
Requirements:
Use BufferedReader for console input.
Use FileWriter to write the data into a file.
Handle exceptions properly.
*/

package com.iostreams;

import java.io.*;

public class ReadUserInputFromConsole {

	public static void main(String[] args) {

		File file = new File("userData.txt");

		try (	// Read input from console
				BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
				// Write data to file
				FileWriter writer = new FileWriter(file)) {
			
			System.out.print("Enter your name: ");
			String name = consoleReader.readLine();

			System.out.print("Enter your age: ");
			String age = consoleReader.readLine();

			System.out.print("Enter your favorite programming language: ");
			String language = consoleReader.readLine();

			// Save user data into file
			writer.write("Name: " + name + "\n");
			writer.write("Age: " + age + "\n");
			writer.write("Favorite Language: " + language + "\n");

			System.out.println("User data saved successfully.");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
