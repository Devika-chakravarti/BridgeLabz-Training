import java.util.*;
public class SumOfNumbers{
	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		double total = 0.0;
		double value = input.nextDouble();


		// Check whether the input integer is 0 or not (if the value is not zero then enter in this if block)
		if(value!=0){

			// Using while to keep comparing value becomes zero 
			while(value!=0){

				// Adding all values and storing it in total variable
				total += value;
				// Keep taking input from user
				value = input.nextDouble();
			}
		}


		// Print total sum of the numbers
		System.out.println(total);


		input.close();
	}
}