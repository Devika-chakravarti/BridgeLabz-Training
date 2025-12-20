import java.util.*;
public class ChocolateDistributionCalculation{


	// Static method(no need to create object in main method to call this method as it belongs to the class and not to the instance) to calculate how many chocolates will be equally distributed and how many chocolates will remain left among the students
	public static int[] calculateDistributedAndRemainingChocolates(int number, int divisor){
		// calculating quotient (number of chocolates distributed equally)
		int quotient = number / divisor;
		// calculating remainder (number of chocolates remain left)
		int remainder = number % divisor;

		// returns the quotient and remainder in array form
		return new int[]{quotient, remainder};
	}


	// Main method to take input (i.e. number of students and number of chocolates) from the user 
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);

		// Take input from the user
		System.out.print("Enter the number of chocolates: ");
		int numberOfChocolates = input.nextInt();
		System.out.print("Enter the number of students: ");
		int numberOfStudents = input.nextInt();

		// Simply pass the values to calculateDistributedAndRemainingChocolates and stores in array result
		int[] result = calculateDistributedAndRemainingChocolates(numberOfChocolates, numberOfStudents);
		
		// Print how many chocolates will each student gets and how many will remain undistributed using result array  
		System.out.print("Each child will get " + result[0] + " chocolates");
		System.out.print(" and remaining chocolates " + result[1]);

		input.close();
	}
}