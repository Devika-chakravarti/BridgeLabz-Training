/* FlashDealz – Product Sorting by Discount (Quick Sort)
Story: An e-commerce platform runs a flash sale with millions of products, each offering
different discounts. Users want to see the top discounted products instantly. To quickly sort
such large data, the backend uses Quick Sort, known for its fast average-case performance
and efficiency.
Concepts Involved:
● Quick Sort
● Large unsorted data
● Performance optimization
*/

package com.sorting.flashdealz;

import java.util.Scanner;

public class FlashDealz {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("==============================================");
		System.out.println("   FlashDealz – Product Sorting by Discount");
		System.out.println("==============================================\n");

		System.out.print("Enter the number of products: ");
		int numberOfProducts = input.nextInt();

		Products[] discountedProducts = new Products[numberOfProducts];

		for (int i = 0; i < numberOfProducts; i++) {
			System.out.println("\nDiscounted products " + (i + 1));
			System.out.print("Enter the product ID: ");
			int productId = input.nextInt();
			System.out.print("Enter the product name: ");
			String productName = input.next();
			System.out.print("Enter the discount: ");
			double discount = input.nextDouble();

			discountedProducts[i] = new Products(productId, productName, discount);
		}
		quicksort(discountedProducts, 0, numberOfProducts - 1);
		System.out.println("\nTop discounted products:");
		System.out.println("----------------------------------------------");
		for (int i = 0; i < numberOfProducts; i++) {
			discountedProducts[i].display();
		}
	}

	public static void quicksort(Products[] arr, int low, int high) {
		if (low < high) {
			int p = partition(arr, low, high);
			quicksort(arr, low, p - 1);
			quicksort(arr, p + 1, high);
		}
	}

	public static int partition(Products[] arr, int low, int high) {
		double pivot = arr[high].discount;
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (arr[j].discount <= pivot) {
				i++;
				Products temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		Products temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}
}
