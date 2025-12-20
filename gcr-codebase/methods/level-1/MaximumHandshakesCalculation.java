import java.util.*;
public class MaximumHandshakesCalculation{


	// Method to calculate the maximum number of handshakes among students
	public int maxHandshakes(int numberOfStudents){
		// Calculation of maximum handshakes possible using formula
		int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
		// Return the maximum handshakes possible
		return maxHandshakes;
	}


	// Main method to take number of students input from the user and create object of the class to call the maxHandshakes method in which the calculation has done
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		// Take number of students input from the user
		System.out.print("Enter the number of students: ");
		int numberOfStudents = input.nextInt();
		
		// Create object max to call the method
		MaximumHandshakesCalculation max = new MaximumHandshakesCalculation();

		// Stores the called function return value
		int result = max.maxHandshakes(numberOfStudents);

		// Print the value of result(which stored the maximum handshakes possible calculation)
		System.out.println("Number of possible handshakes: " + result);
	
		input.close();
	}
}