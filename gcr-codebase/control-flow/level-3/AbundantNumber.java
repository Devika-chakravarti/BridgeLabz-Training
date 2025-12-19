import java.util.*;
public class AbundantNumber{
	public static void main(String args[]){

        	Scanner input = new Scanner(System.in);
       		int number = input.nextInt();
		// Stores the sum of all the divisors of the number
		int sum = 0;


        	// Loop from 1 to number-1 to find divisors
        	for(int i = 1; i < number; i++){
            		if(number % i == 0){
				// Add divisor to sum
                		sum = sum + i; 
        	    	}
	        }


        	// Check if sum of divisors is greater than number, if true then it's an abundant number and if false then it's not an abundant number
        	if(sum > number){
            		System.out.println("Abundant Number");
        	}else{
            		System.out.println("Not an Abundant Number");
        	}


        	input.close();
    	}
}
