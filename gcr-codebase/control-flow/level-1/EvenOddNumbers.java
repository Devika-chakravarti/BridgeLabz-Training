import java.util.*;
public class EvenOddNumbers{
	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		int number = input.nextInt();

		// Check that input number is a natural number or not
		if(number > 0){

			// Using for loop to check from 1 upto the number
			for(int i = 1; i <= number; i++){
				// Check for the even number
				if(i % 2 == 0){
					System.out.println(i + " is even");
				}
				// Otherwise number will be consider as odd
				else{
					System.out.println(i + " is odd");	
				}
			}
		}


		input.close();

	}
}