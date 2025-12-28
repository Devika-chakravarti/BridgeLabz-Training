/*
Problem: Harshad number
Problem description: An integer divisible by the sum of its digits is said to be a Harshad number. You are given an integer x. Return the sum of the digits of x if x is a Harshad number, otherwise, return -1.
*/


class HarshadNumberSolution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
	
	// Declare and initialize sum with 0 to calculate the sum of each digit of the number
        int sum = 0;
	// Declare and initialize temp with x to store it's copy
        int temp = x;

        // Calculate the sum of digits
        while(temp > 0) {
	    // Get last digit and add to sum
            sum += temp % 10; 
	    // Remove last digit
            temp /= 10;       
        }

        // Check if x is divisible by the sum of its digits
        if(x % sum == 0) {
	    // It is a Harshad number
            return sum; 
        }

        // If not divisible then return -1
        return -1;
    }
}
