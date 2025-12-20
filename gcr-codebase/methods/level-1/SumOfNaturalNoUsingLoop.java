import java.util.*;
public class SumOfNaturalNoUsingLoop{


	// Method to calculate sum of all natural number upto number which is taken from the user
	public int calculateSumOfNaturalNo(int number){
		// totalSum stores the summation of natural numbers
		int totalSum = 0;
		// Iterate using for loop and stores the sum value in totalSum variable
		for(int i = 1 ; i <= number ; i++){
			totalSum += i;
		}
		// return the calculated totalSum
		return totalSum;
	}


	// Main method to take input number from the user and create object to call the calculateSumOfNaturalNo method
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		// Take input from the user
		System.out.print("Enter the number: ");
		int number = input.nextInt();

		// Object sum is create
		SumOfNaturalNoUsingLoop sum = new SumOfNaturalNoUsingLoop();
		// totalSum stores the method calling value
		int totalSum = sum.calculateSumOfNaturalNo(number);

		// Print the sum of natural numbers
		System.out.println("Sum of natural numbers: " + totalSum + " (upto " + number + ")");

		input.close();
	}
}