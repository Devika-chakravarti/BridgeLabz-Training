/*Piped Streams - Inter-Thread Communication
📌 Problem Statement:
Implement a Java program where one thread writes data into a PipedOutputStream and another thread reads data from a PipedInputStream.
Requirements:
Use two threads for reading and writing.
Synchronize properly to prevent data loss.
Handle IOException.
*/

package com.iostreams;

import java.io.*;

public class InterThreadCommunication {

	public static void main(String[] args) {

		try {
			// Connect piped streams
			PipedOutputStream pos = new PipedOutputStream();
			PipedInputStream pis = new PipedInputStream(pos);

			// Writer thread
			Thread writer = new Thread(new Runnable() {
				public void run() {
					try {
						String message = "Hello from Writer Thread";
						pos.write(message.getBytes());
						pos.close(); // signal end of data
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			});

			// Reader thread
			Thread reader = new Thread(new Runnable() {
				public void run() {
					try {
						int data;
						while ((data = pis.read()) != -1) {
							System.out.print((char) data);
						}
						pis.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			});

			// Start both threads
			writer.start();
			reader.start();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
