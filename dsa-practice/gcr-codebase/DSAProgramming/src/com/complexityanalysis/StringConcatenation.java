package com.complexityanalysis;

public class StringConcatenation {

	public static void main(String[] args) {

		int[] operationCounts = {1000, 10000, 1000000};

		for (int i = 0; i < operationCounts.length; i++) {

			int n = operationCounts[i];
			System.out.println("Operations Count: " + n);

			// Using String (O(N^2))
			if (n <= 10000) { // skip for very large input
				String str = "";
				long startString = System.nanoTime();

				for (int j = 0; j < n; j++) {
					str = str + "a";
				}

				long endString = System.nanoTime();
				System.out.println("String Time (ns): " + (endString - startString));
			} else {
				System.out.println("String: Skipped");
			}

			// Using StringBuilder (O(N))
			StringBuilder sb = new StringBuilder();
			long startBuilder = System.nanoTime();

			for (int j = 0; j < n; j++) {
				sb.append("a");
			}

			long endBuilder = System.nanoTime();
			System.out.println("StringBuilder Time (ns): " + (endBuilder - startBuilder));

			// Using StringBuffer (O(N))
			StringBuffer sbuf = new StringBuffer();
			long startBuffer = System.nanoTime();

			for (int j = 0; j < n; j++) {
				sbuf.append("a");
			}

			long endBuffer = System.nanoTime();
			System.out.println("StringBuffer Time (ns): " + (endBuffer - startBuffer));

			System.out.println("-------------------------------------");
		}
	}
}
