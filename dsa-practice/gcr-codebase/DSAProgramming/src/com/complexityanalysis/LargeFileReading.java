package com.complexityanalysis;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LargeFileReading {

    private static final int BUFFER_SIZE = 4096; // 4KB buffer

    // Reading using FileReader (Character Stream)
    public static void readUsingFileReader(File file) throws IOException {
        FileReader reader = new FileReader(file);
        char[] buffer = new char[BUFFER_SIZE];

        while (reader.read(buffer) != -1) {
            // Just reading, no processing
        }
        reader.close();
    }

    // Reading using InputStreamReader (Byte Stream -> Character Stream)
    public static void readUsingInputStreamReader(File file) throws IOException {
        InputStreamReader reader =
                new InputStreamReader(new FileInputStream(file));
        char[] buffer = new char[BUFFER_SIZE];

        while (reader.read(buffer) != -1) {
            // Just reading, no processing
        }
        reader.close();
    }

    public static void main(String[] args) {

        // Change path to point to a large file
        File file = new File("D:/sample.txt");

        try {
            // FileReader timing
            long startFileReader = System.nanoTime();
            readUsingFileReader(file);
            long endFileReader = System.nanoTime();

            // InputStreamReader timing
            long startInputStreamReader = System.nanoTime();
            readUsingInputStreamReader(file);
            long endInputStreamReader = System.nanoTime();

            long fileReaderTime = endFileReader - startFileReader;
            long inputStreamReaderTime = endInputStreamReader - startInputStreamReader;

            System.out.println("File Size: " + (file.length() / (1024 * 1024)) + " MB");
            System.out.println("FileReader Time (ns): " + fileReaderTime);
            System.out.println("InputStreamReader Time (ns): " + inputStreamReaderTime);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
