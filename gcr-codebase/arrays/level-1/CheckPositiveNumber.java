import java.util.*;
public class CheckPositiveNumber{
	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		// Declare an array of size 5 to take input from user by using for loop
		int[] array = new int[5];
		for(int i = 0 ; i < array.length ; i++){
			array[i] = input.nextInt();
		}
		

		
		// Iterate through the array using for loop
		for(int i = 0 ; i < array.length ; i++){

			// Check for the positive integer
			if(array[i] > 0){
	
				// Check for the even number, and print even
				if(array[i] % 2 == 0){
					System.out.println(array[i] + " is an even number");
				}
				// If not even, then odd number and print odd
				else{
					System.out.println(array[i] + " is an odd number");
				}
			}
			// Check for the negative integer
			else if(array[i] < 0){
				System.out.println("negative");
			}
			// If not positive nor negative, then print zero
			else{
				System.out.println("zero");
			}
		}


		
		// Compare the first and last element whether equal, greater or less
		if(array[0] == array[array.length-1]){
			System.out.println("First and last element are equal");
		}
		else if(array[0] > array[array.length-1]){
			System.out.println("First element is greater than last element");
		}
		else{
			System.out.println("First element is less than last element");				
		}

		


		input.close();
	}
}