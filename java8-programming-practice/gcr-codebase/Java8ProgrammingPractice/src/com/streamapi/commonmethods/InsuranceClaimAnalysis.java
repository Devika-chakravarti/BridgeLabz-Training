/*Insurance Claim Analysis
○ Scenario: Find the average claim amount for each claim type.
○ Task: Use groupingBy() and averagingDouble().*/

package com.streamapi.commonmethods;

import java.util.*;
import java.util.stream.Collectors;

class InsuranceClaim {
	private String claimType;
	private double amount;
	public InsuranceClaim(String claimType, double amount) {
		this.claimType = claimType;
		this.amount = amount;
	}
	public String getClaimType() {
		return claimType;
	}
	public double getAmount() {
		return amount;
	}
}

public class InsuranceClaimAnalysis {
	private static Map<String, Double> calculateAverageByClaimType(List<InsuranceClaim> claims) {
		return claims.stream().collect(Collectors.groupingBy(InsuranceClaim::getClaimType,
				Collectors.averagingDouble(InsuranceClaim::getAmount)));
	}
	private static void displayResult(Map<String, Double> result) {
		result.forEach((type, avg) -> System.out.println(type + " : " + avg));
	}
	public static void main(String[] args) {
		List<InsuranceClaim> claims = Arrays.asList(new InsuranceClaim("Health", 50000),
				new InsuranceClaim("Vehicle", 30000), new InsuranceClaim("Health", 70000),
				new InsuranceClaim("Travel", 20000), new InsuranceClaim("Vehicle", 40000));
		Map<String, Double> averageClaims = calculateAverageByClaimType(claims);
		displayResult(averageClaims);
	}
}
