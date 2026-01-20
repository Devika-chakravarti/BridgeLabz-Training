package com.sorting.foodfest;

public class FoodFestManager {
	
	// Merge sort logic
	public static void mergeSort(FoodStall[] arr, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}
	}

	// Merging logic
	public static void merge(FoodStall[] arr, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;
		
		FoodStall[] L = new FoodStall[n1];
		FoodStall[] R = new FoodStall[n2];
		
		for (int i = 0; i < n1; i++) {
			L[i] = arr[left + i];
		}
		for (int j = 0; j < n2; j++) {
			R[j] = arr[mid + 1 + j];
		}
		
		int i = 0, j = 0, k = left;
		while (i < n1 && j < n2) {
			if (L[i].customers >= R[j].customers) {
				arr[k++] = L[i++];
			} else {
				arr[k++] = R[j++];
			}
		}
		
		while (i < n1) {
			arr[k++] = L[i++];
		}
		while (j < n2) {
			arr[k++] = R[j++];
		}
	}
}
