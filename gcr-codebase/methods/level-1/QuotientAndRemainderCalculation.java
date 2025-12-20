import java.util.*;
public class QuotientAndRemainderCalculation{


	// Static method(no need to create object in main method to call this method as it belongs to the class and not to the instance) to find the remainder and quotient taking number and divisor as parameters
	public static int[] findRemainderAndQuotient(int number, int divisor){
		
		// Calculate quotient
		int quotient = number / divisor;
		// Calculate remainder
		int remainder = number % divisor;

		// Return the quotient and remainder in array form
		return new int[]{quotient, remainder};
	}


	public static void main(String args[]){
		Scanner input = new Scanner(System.in);

		// Take inetegr input number and divisor from the user
		System.out.print("Enter the number: ");
		int number = input.nextInt();
		System.out.print("Enter the divisor: ");
		int divisor = input.nextInt();

		// Array result will store the calculated quotient and remainder by calling function with it's arguments 
		int[] result = findRemainderAndQuotient(number, divisor);
		
		// Print quotient and remainder
		System.out.println("Quotient: " + result[0]);
		System.out.println("Remainder: " + result[1]);

		input.close();
	}
}