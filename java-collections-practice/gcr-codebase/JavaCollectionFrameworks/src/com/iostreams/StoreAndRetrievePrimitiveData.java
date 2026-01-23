/*Data Streams - Store and Retrieve Primitive Data
📌 Problem Statement:
Write a Java program that stores student details (roll number, name, GPA) in a binary file and retrieves it later.
Requirements:
Use DataOutputStream to write primitive data.
Use DataInputStream to read data.
Ensure proper closing of resources.
*/

package com.iostreams;

import java.io.*;

public class StoreAndRetrievePrimitiveData {

	public static void main(String[] args) {

		File file = new File("student.dat");

		// Write primitive data to binary file
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))) {

			dos.writeInt(101); // roll number
			dos.writeUTF("Devika"); // name
			dos.writeDouble(7.96); // CGPA

			System.out.println("Student data stored successfully.");

		} catch (IOException e) {
			e.printStackTrace();
		}

		// Read primitive data from binary file
		try (DataInputStream dis = new DataInputStream(new FileInputStream(file))) {

			int rollNo = dis.readInt();
			String name = dis.readUTF();
			double gpa = dis.readDouble();

			System.out.println("Roll No: " + rollNo);
			System.out.println("Name   : " + name);
			System.out.println("GPA    : " + gpa);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
