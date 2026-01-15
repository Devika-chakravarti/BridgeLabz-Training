package com.sorting.zipzipmart;

public class ZipZipMartMergeSort {

	public static void mergeSort(Sale[] arr, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}
	}

	private static void merge(Sale[] arr, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;

		Sale[] L = new Sale[n1];
		Sale[] R = new Sale[n2];

		for (int i = 0; i < n1; i++)
			L[i] = arr[left + i];
		for (int j = 0; j < n2; j++)
			R[j] = arr[mid + 1 + j];

		int i = 0, j = 0, k = left;

		// sort first by date, then by amount
		while (i < n1 && j < n2) {
			if (L[i].date.compareTo(R[j].date) < 0 || (L[i].date.equals(R[j].date) && L[i].amount <= R[j].amount)) {
				arr[k++] = L[i++];
			} else {
				arr[k++] = R[j++];
			}
		}

		while (i < n1)
			arr[k++] = L[i++];
		while (j < n2)
			arr[k++] = R[j++];
	}
}
