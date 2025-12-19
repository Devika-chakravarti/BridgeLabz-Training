import java.util.*;
public class MultiplicationTable{
	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		// Declare a multiplication array of size 10 
		int[] multiplication = new int[10];
		

		// Iterate over 10 times using for loop to print the multiplcation table of user input number
		for(int i = 1 ; i <= 10 ; i++){

			// Storing multiplication value to multiplication array
			multiplication[i-1] = number * i;
		} 

			
		// Print the multiplication table of 
		for(int i = 1 ; i <= 10; i++){
			System.out.println(number + " * " + i + " = " + multiplication[i-1]);
		}


		input.close();
	}
}