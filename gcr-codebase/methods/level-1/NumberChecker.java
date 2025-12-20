import java.util.*;
public class NumberChecker{


	// Method to check whether the number is positive, negative or zero
	public int checkNumber(int number){
		// Check for negative number and return -1
		if(number < 0){
			return -1;
		}
		// Check for positive number and return 1
		else if(number > 0){
			return 1;
		}
		// Otherwise return 0
		else{
			return 0;
		}
	}

	
	// Main method to take integer input from the user and create object to call the checkNumber method where it is checked whether number is negative, positive or zero
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		// Take integer input from the user
		System.out.print("Enter the number: ");
		int number = input.nextInt();

		// Create object checker to call the checkNumber method
                NumberChecker checker = new NumberChecker();
		// Stores the method calling computation
		int result = checker.checkNumber(number);
		
		// Print the result whether the user input number is positive, negative or zero and return 1, -1 and 0 accordingly
		System.out.println(result);		

		input.close();
	}
}