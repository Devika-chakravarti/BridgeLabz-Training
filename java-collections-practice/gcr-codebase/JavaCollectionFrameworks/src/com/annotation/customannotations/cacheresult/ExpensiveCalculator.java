package com.annotation.customannotations.cacheresult;

public class ExpensiveCalculator {

	@CacheResult
	public long factorial(int n) {
		System.out.println("Computing factorial for: " + n);
		long result = 1;
		for (int i = 2; i <= n; i++) {
			result *= i;
		}
		return result;
	}
}
