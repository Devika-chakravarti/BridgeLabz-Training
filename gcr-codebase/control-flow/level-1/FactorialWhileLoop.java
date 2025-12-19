import java.util.*;
public class FactorialWhileLoop {
    	public static void main(String args[]) {

        	Scanner input = new Scanner(System.in);
        	int number = input.nextInt();


        	// Check for positive integer
        	if(number > 0){
            	int factorial = 1;
            	int i = 1;

            		// Compute factorial using while loop
            		while(i <= number){
                		factorial *= i;
                		i++;
            		}


            		// Print factorial
            		System.out.println("Factorial of " + number + " is " + factorial);
        	} 


        	input.close();
    	}
}
