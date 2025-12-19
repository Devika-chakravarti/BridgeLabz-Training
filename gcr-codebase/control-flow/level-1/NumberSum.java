// Created a program to find the sum until the user enters 0 or a negative number using while loop and break statement

import java.util.*;
public class SumOfNumberUntilZeroUsingBreak{
	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		double total = 0.0;

		
		while(true){
			double value = input.nextDouble();
			if(value == 0 || value < 0){
				break;
			}

			// Adding all values and storing it in total variable
			total += value;
	
		}
		

		// Print total sum of the numbers
		System.out.println(total);


		input.close();
	}
}