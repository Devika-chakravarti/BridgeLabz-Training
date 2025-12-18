// Program to check whether the number is positive, negative, or zero.
import java.util.*;
public class CheckNumber{
	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		int number = input.nextInt();

		
		// Check if number is positive (using if block) 
		if(number > 0){
			System.out.println("positive");
		}

		// Check if number is negative (using else if block)
		else if(number < 0){
			System.out.println("negative");
		}
	
		// print zero otherwise (because the number isn't positive nor negative)
		else{
			System.out.println("zero");
		}


		input.close();
	}
}