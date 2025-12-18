// Program to check whether the number is natural number or not, if it is then find sum of n natural numbers otherwise print not a natural number.

import java.util.Scanner;
public class NaturalNumber{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();


		// Checking whether number is a natural number or not and if yes then calculate sum of these natural numbers
		if(number >= 0){

			// Calculating sum of natural numbers
			int sumOfNaturalNumber = number * (number+1) / 2;
			// Print sum of natural numbers
			System.out.println("The sum of " + number + " natural numbers is " + sumOfNaturalNumber);
		}
		
		// Otherwise Print The number is not a natural number
		else{
			System.out.println("The number " + number + " is not a natural number");
		}


		input.close();
	}
}