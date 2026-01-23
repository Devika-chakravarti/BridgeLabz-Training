/*Buffered Streams - Efficient File Copy
📌 Problem Statement:
Create a Java program that copies a large file (e.g., 100MB) from one location to another using Buffered Streams 
(BufferedInputStream and BufferedOutputStream). Compare the performance with normal file streams.
Requirements:
Read and write in chunks of 4 KB (4096 bytes).
Use System.nanoTime() to measure execution time.
Compare execution time with unbuffered streams.
*/

package com.iostreams;

import java.io.*;

public class EfficientFileCopy {

	private static final int BUFFER_SIZE = 4096; // 4 KB chunk size

	public static void main(String[] args) {

		File sourceFile = new File("largeInput.dat");
		File bufferedDest = new File("bufferedCopy.dat");
		File unbufferedDest = new File("unbufferedCopy.dat");

		if (!sourceFile.exists()) {
			System.out.println("Source file does not exist.");
			return;
		}

		// Measure unbuffered stream copy time
		long startUnbuffered = System.nanoTime();
		copyUsingUnbufferedStreams(sourceFile, unbufferedDest);
		long endUnbuffered = System.nanoTime();

		// Measure buffered stream copy time
		long startBuffered = System.nanoTime();
		copyUsingBufferedStreams(sourceFile, bufferedDest);
		long endBuffered = System.nanoTime();

		System.out.println("Unbuffered Time (ns): " + (endUnbuffered - startUnbuffered));
		System.out.println("Buffered Time (ns):   " + (endBuffered - startBuffered));
	}

	// Copies file using normal file streams
	private static void copyUsingUnbufferedStreams(File source, File dest) {
		try (FileInputStream fis = new FileInputStream(source); FileOutputStream fos = new FileOutputStream(dest)) {

			byte[] buffer = new byte[BUFFER_SIZE];
			int bytesRead;

			while ((bytesRead = fis.read(buffer)) != -1) {
				fos.write(buffer, 0, bytesRead);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Copies file using buffered streams for better performance
	private static void copyUsingBufferedStreams(File source, File dest) {
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {

			byte[] buffer = new byte[BUFFER_SIZE];
			int bytesRead;

			while ((bytesRead = bis.read(buffer)) != -1) {
				bos.write(buffer, 0, bytesRead);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
