/*Validate CSV Data Before Processing
Ensure that the "Email" column follows a valid email format using regex.
Ensure that "Phone Numbers" contain exactly 10 digits.
Print any invalid rows with an error message.
*/

package com.csvdatahandling;

import java.io.*;

public class ValidateCSVData {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("users.csv"))) {
			String line;

			line = br.readLine();

			while ((line = br.readLine()) != null) {
				String[] columns = line.split(",");
				String email = columns[2]; // Assuming Email is column 3
				String phone = columns[3]; // Assuming Phone is column 4
				boolean invalid = false;

				// Check email format
				if (!email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$")) {
					System.out.println("Invalid email: " + line);
					invalid = true;
				}

				// Check phone number length (exactly 10 digits)
				if (!phone.matches("\\d{10}")) {
					System.out.println("Invalid phone number: " + line);
					invalid = true;
				}

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
