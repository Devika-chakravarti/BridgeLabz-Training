package com.searchingalgorithmandother.stringbuffer;

public class CompareBufferBuilder {

	public static void main(String[] args) {
		int n = 1_000_000;

		StringBuffer stringBuffer = new StringBuffer();
		long startBuffer = System.nanoTime();
		for (int i = 0; i < n; i++) {
			stringBuffer.append("hello");
		}

		long endBuffer = System.nanoTime();
		long bufferTime = endBuffer - startBuffer;

		StringBuilder stringBuilder = new StringBuilder();
		long startBuilder = System.nanoTime();
		for (int i = 0; i < n; i++) {
			stringBuilder.append("hello");
		}
		
		long endBuilder = System.nanoTime();
		long builderTime = endBuilder - startBuilder;

		System.out.println("Time taken by StringBuffer: " + bufferTime + " ns");
		System.out.println("Time taken by StringBuilder: " + builderTime + " ns");
	}
}
