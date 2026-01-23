/*ByteArray Stream - Convert Image to ByteArray
📌 Problem Statement:
Write a Java program that converts an image file into a byte array and then writes it back to another image file.
Requirements:
Use ByteArrayInputStream and ByteArrayOutputStream.
Verify that the new file is identical to the original image.
Handle IOException.
*/

package com.iostreams;

import java.io.*;

public class ConvertImageToByteArray {

	public static void main(String[] args) {

		File inputImage = new File("input.jpg");
		File outputImage = new File("output.jpg");

		if (!inputImage.exists()) {
			System.out.println("Input image does not exist.");
			return;
		}

		try (	// Read image file
				FileInputStream fis = new FileInputStream(inputImage);
				ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
			
			byte[] buffer = new byte[4096];
			int bytesRead;

			// Convert image to byte array
			while ((bytesRead = fis.read(buffer)) != -1) {
				baos.write(buffer, 0, bytesRead);
			}

			byte[] imageBytes = baos.toByteArray();

			// Write byte array back to image file
			try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
					FileOutputStream fos = new FileOutputStream(outputImage)) {
				while ((bytesRead = bais.read(buffer)) != -1) {
					fos.write(buffer, 0, bytesRead);
				}
			}

			System.out.println("Image converted and written successfully");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
