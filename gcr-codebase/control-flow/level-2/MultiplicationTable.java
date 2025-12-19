import java.util.*;
public class MultiplicationTable{
	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		int number = input.nextInt();


		// Using for loop from 6 to 9 as to print the table of number from 6 to 9 not the complete table
		for(int i=6; i<=9; i++){
			// Print multiplication table of a number entered by the user from 6 to 9
			System.out.println(number + " * " + i + " = " + (number * i));
		}

		
		input.close();
	}
}