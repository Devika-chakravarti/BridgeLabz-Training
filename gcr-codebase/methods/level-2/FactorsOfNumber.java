import java.util.*;
public class FactorsOfNumber{


	// Static method to find factors and return them in an array 	
	public static int[] findFactors(int number){
		
		// First loop to Count the number of factors
		int count = 0;
		for(int i=1;i<=number;i++){
			if(number%i==0){
				count++;
			}
		}

		// Inititalize array with count
		int[] factors = new int[count];
		
		// Second loop to store the factors in array
		int index = 0;
		for(int i=1;i<=number;i++){
			if(number%i==0){
				factors[index++] = i;
			}
		}
		
		return factors;
	}


	// Method to find the sum of factors
	public int findSumOfFactors(int[] factors){
		int sum = 0;
		for(int i=0;i<factors.length;i++){
			sum += factors[i];
		}
		return sum;
	}


	// Method to find the product of factors
	public int findProductOfFactors(int[] factors){
		int product = 1;
		for(int i=0;i<factors.length;i++){
			product *= factors[i];
		}
		return product;
	}


	// Method to find the sum of squares of factors
	public int findSumOfSquareOfFactors(int[] factors){
		int sum = 0;
		for(int i=0;i<factors.length;i++){
			sum += Math.pow(factors[i], 2);
		}
		return sum;
	}


	// Main method to take input number and displaying the calculations
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		// Take integer input from the user
		System.out.print("Enter a number: ");
		int number = input.nextInt();

		// Create object to call non-static methods
		FactorsOfNumber obj = new FactorsOfNumber();

		// Find factors and then display them
		int[] factors = findFactors(number);
		System.out.print("Factors are: ");
		for(int i=0;i<factors.length;i++){
			System.out.print(factors[i] + " ");
		}		
		System.out.println();

		// Print the calculations
		System.out.println("Sum of factors: " + obj.findSumOfFactors(factors));
		System.out.println("Product of factors: " + obj.findProductOfFactors(factors));
		System.out.println("Sum of squares of factors: " + obj.findSumOfSquareOfFactors(factors));

		input.close();
	}

}