/* Find Frequency of Elements
Given a list of strings, count the frequency of each element and return the results in a Map<String, Integer>.
Example:
Input: ["apple", "banana", "apple", "orange"] → Output: {apple=2, banana=1, orange=1}.
*/

package com.collections.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfElements {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		// arraylist to store the name of fruits(elements)
		List<String> list = new ArrayList<>();

		System.out.print("Enter the number of elements: ");
		int numberOfElements = input.nextInt();
		input.nextLine();

		System.out.println("Enter elements:");
		for (int i = 0; i < numberOfElements; i++) {
			list.add(input.nextLine());
		}

		// hashmap to store the frequency count of the fruits(elements) 
		Map<String, Integer> frequencyMap = new HashMap<>();

		for (int i = 0; i < list.size(); i++) {
			String key = list.get(i);

			if (frequencyMap.containsKey(key)) {
				frequencyMap.put(key, frequencyMap.get(key) + 1);
			} else {
				frequencyMap.put(key, 1);
			}
		}
		
		System.out.println("Frequency map: " + frequencyMap);
	}
}
