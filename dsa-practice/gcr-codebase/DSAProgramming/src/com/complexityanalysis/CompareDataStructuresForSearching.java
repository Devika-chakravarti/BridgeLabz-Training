package com.complexityanalysis;

import java.util.HashSet;
import java.util.TreeSet;

public class CompareDataStructuresForSearching {

	// Linear search on Array O(N)
	public static boolean arraySearch(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		int[] datasetSizes = { 1000, 100000, 1000000 };

		for (int i = 0; i < datasetSizes.length; i++) {

			int size = datasetSizes[i];
			int target = size - 1; // Worst-case target

			// Create Array
			int[] array = new int[size];
			for (int j = 0; j < size; j++) {
				array[j] = j;
			}

			// Create HashSet
			HashSet<Integer> hashSet = new HashSet<>();
			for (int j = 0; j < size; j++) {
				hashSet.add(j);
			}

			// Create TreeSet
			TreeSet<Integer> treeSet = new TreeSet<>();
			for (int j = 0; j < size; j++) {
				treeSet.add(j);
			}

			System.out.println("Dataset Size: " + size);

			// Array Search timing
			long startArray = System.nanoTime();
			arraySearch(array, target);
			long endArray = System.nanoTime();
			System.out.println("Array Search Time (ns): " + (endArray - startArray));

			// HashSet Search timing
			long startHashSet = System.nanoTime();
			hashSet.contains(target);
			long endHashSet = System.nanoTime();
			System.out.println("HashSet Search Time (ns): " + (endHashSet - startHashSet));

			// TreeSet Search timing
			long startTreeSet = System.nanoTime();
			treeSet.contains(target);
			long endTreeSet = System.nanoTime();
			System.out.println("TreeSet Search Time (ns): " + (endTreeSet - startTreeSet));

			System.out.println("---------------------------------------");
		}
	}
}
