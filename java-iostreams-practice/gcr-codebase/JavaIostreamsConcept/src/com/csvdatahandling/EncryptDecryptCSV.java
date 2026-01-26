/*Encrypt and Decrypt CSV Data
Encrypt the sensitive fields (e.g., Salary, Email) while writing to a CSV file.
Decrypt them when reading the file.
*/

package com.csvdatahandling;

import java.io.*;
import java.util.Base64;

public class EncryptDecryptCSV {

	// Encrypt a string using Base64
	public static String encrypt(String data) {
		return Base64.getEncoder().encodeToString(data.getBytes());
	}

	// Decrypt a string using Base64
	public static String decrypt(String data) {
		return new String(Base64.getDecoder().decode(data));
	}

	// Write CSV with encrypted fields
	public static void writeEncryptedCSV() {
		String outputFile = "employees_encrypted.csv";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

			// Write header
			bw.write("ID,Name,Department,Salary,Email\n");

			// Sample employee records
			String[][] employees = { { "101", "Devika", "IT", "70000", "devika@example.com" },
					{ "102", "Annu", "HR", "50000", "annu@example.com" },
					{ "103", "Satya", "Finance", "55000", "satya@example.com" } };

			for (String[] emp : employees) {
				// Encrypt Salary and Email
				String encryptedSalary = encrypt(emp[3]);
				String encryptedEmail = encrypt(emp[4]);
				bw.write(emp[0] + "," + emp[1] + "," + emp[2] + "," + encryptedSalary + "," + encryptedEmail + "\n");
			}

			System.out.println("CSV written with encrypted fields.");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Read CSV and decrypt sensitive fields
	public static void readDecryptedCSV() {
		String inputFile = "employees_encrypted.csv";
		try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
			String line;
			line = br.readLine();

			while ((line = br.readLine()) != null) {
				String[] columns = line.split(",");
				String decryptedSalary = decrypt(columns[3]);
				String decryptedEmail = decrypt(columns[4]);
				System.out.println("ID: " + columns[0] + ", Name: " + columns[1] + ", Department: " + columns[2]
						+ ", Salary: " + decryptedSalary + ", Email: " + decryptedEmail);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		writeEncryptedCSV();
		readDecryptedCSV();
	}
}
