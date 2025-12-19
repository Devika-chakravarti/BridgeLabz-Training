import java.util.*;
public class FactorsOfNumber{
	public static void main(String args[]){

        	Scanner input = new Scanner(System.in);
        	int number = input.nextInt();



        	// Check if the input number is positive integer
      		if(number > 0){
			
			System.out.println("Factors are: ");
            		// Loop from 1 to number-1
           	 	for(int i = 1; i < number; i++){
				// Checking if a number divides another number exactly, leaving no remainder
                		if(number % i == 0){
					// Print the factors
                    			System.out.println(i);
                		}
            		}
        	}



        	input.close();
	}
}
