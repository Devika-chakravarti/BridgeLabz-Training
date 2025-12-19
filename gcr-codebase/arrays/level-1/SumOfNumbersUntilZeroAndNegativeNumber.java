import java.util.*;
public class SumOfNumbersUntilZeroAndNegativeNumber{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		// Initialize total with 0.0 and in this variable sum of numbers will be stored
		double total = 0.0;
		// Declare array with the size 10
		double[] array = new double[10];
		int index = 0;



		// Using infinite while loop
		while(true){
			// Take input from the user until the user enters zero and negative number

			double number = input.nextDouble();
			if(number <= 0){
				break;
			}
			// Break if index has value 10 as array size is limited to 10
			if(index == 10){
				break;
			}
			// Assigning the number to array element
			array[index] = number;
			// Increment the index value
			index++;
		}



		// Using for loop to add the numbers and store them in total variable
		for(int i = 0 ; i < index ; i++){
			total += array[i];
		}
		// Print total sum of the numbers entered by the user
		System.out.println("Total sum: " + total);



		input.close();	
	}
}