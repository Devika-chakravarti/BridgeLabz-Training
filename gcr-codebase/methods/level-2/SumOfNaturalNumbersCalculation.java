import java.util.*;
public class SumOfNaturalNumbersCalculation{
	
	// Method to compute the sum of natural numbers using recursion
	public int sumUsingRecursion(int number){
		// Base case
		if(number == 1){
			return 1;
		}
		// Recursive call adding current number
		return number + sumUsingRecursion(number-1);
	}


	// Method to compute the sum of natural numbers using formula
	public int sumUsingFormula(int number){
		// Formula to compute the sum of natural numbers
		int sumFormula = number*(number+1)/2;
		return sumFormula;
	}


	// Main method to take input number from the user and compare both results 
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		// Check for the positive number input
		if(number <= 0){
			System.out.println("Enter number greater than 0");
			return;
		}

		// Object create to call the non static methods  
		SumOfNaturalNumbersCalculation checker = new SumOfNaturalNumbersCalculation();

		// Variable to store the results from recursion and formula
		int resultRecursion = checker.sumUsingRecursion(number);
		int resultFormula = checker.sumUsingFormula(number);
		
		// Compare the results of sum of natural numbers and print the statement accordingly
		if(resultRecursion == resultFormula){
			System.out.println("Sum of natural numbers using recursion and formula are same");
		}
		else{
		        System.out.println("Sum of natural numbers using recursion and formula are not same");
		}

		
		input.close();

	}
}