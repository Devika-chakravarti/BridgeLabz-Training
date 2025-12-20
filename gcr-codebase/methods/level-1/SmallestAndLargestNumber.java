import java.util.*;
public class SmallestAndLargestNumber{


	// Static method to find the smallest and largest among 3 integer input taken from the user and passes here as parameters
	public static int[] findSmallestAndLargest(int number1, int number2, int number3){
		// Assumes number1 is smallest
		int smallest = number1;
		// Assumes number1 is smallest
		int largest = number1;

		// Keep comparing to get the smallest and largest among 3 numbers
		if(number2 < smallest){
			smallest = number2;
		}
		if(number3 < smallest){
			smallest = number3;
		}
		if(number2 > largest){
			largest = number2;
		}
		if(number3 > largest){
			largest = number3;
		}

		// Returns the smallest and largest from the array
		return new int[]{smallest, largest};
	}



	// Main method to take 3 integer input from the user and print smallest and largest number by calling the method directly as findSmallestAndLargestis static which means to need to create object to call that method as it belongs to class not to the object
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		// Take 3 integer input from the user
		System.out.print("Enter the number1: ");
		int number1 = input.nextInt();		
		System.out.print("Enter the number2: ");
		int number2 = input.nextInt();
		System.out.print("Enter the number3: ");
		int number3 = input.nextInt();
		
		// Store the values taken from the user in result variable and it will passes to the findSmallestAndLargest method created above
		int[] result = findSmallestAndLargest(number1, number2, number3);
		
		System.out.println();
		// Print the smallest and largest from the array
		System.out.println("Smallest number: " + result[0]);
		System.out.println("Largest number: " + result[1]);

		input.close();
	}
}