/*
Problem: Count Primes
Problem description: Given an integer n, return the number of prime numbers that are strictly less than n.
*/

class CountPrimesSolution {
    public int countPrimes(int n) {

	// No primes less than 2
        if(n <= 2) return 0; 

        // Initialize all numbers as prime
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        // Mark multiples of each prime as not prime and only need to check numbers upto sqrt(n)
        for (int i = 2; i * i < n; i++) {
	    // check if current number is still prime
            if (isPrime[i]) {
		// starting from i*i because smaller multiples were already marked by smaller primes
                for(int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Count all numbers that are still prime
        int count = 0;
        for (int i = 2; i < n; i++) {
            if(isPrime[i]) count++;
        }

        return count;
    }
}
