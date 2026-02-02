/*Transforming Names for Display
Given a list of customer names, use .map() to convert them to uppercase and
.sorted() to display them alphabetically.*/ 

package com.streamapi.commonmethods;

import java.util.*;
import java.util.stream.Collectors;

public class TransformCustomerNames {
	private static List<String> convertToUpperCase(List<String> names) {
		return names.stream().map(String::toUpperCase) 
				.collect(Collectors.toList());
	}

	private static List<String> sortNames(List<String> names) {
		return names.stream().sorted().collect(Collectors.toList());
	}

	private static List<String> getFormattedNames(List<String> names) {
		List<String> upperCaseNames = convertToUpperCase(names);
		return sortNames(upperCaseNames);
	}

	private static void displayNames(List<String> names) {
		names.forEach(System.out::println);
	}

	public static void main(String[] args) {
		List<String> customers = Arrays.asList("Devika", "Annu", "Satya", "Siya", "Shreenu");
		List<String> result = getFormattedNames(customers);
		displayNames(result);
	}
}
