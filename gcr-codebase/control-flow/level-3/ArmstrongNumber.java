import java.util.*;
public class ArmstrongNumber{
	public static void main(String args[]){

        	Scanner input = new Scanner(System.in);
        	int number = input.nextInt();

	
		// Stores the sum of cubes of digits
        	int sum = 0;                  
		// Store the copy of the original number
        	int originalNumber = number;  


        	// Loop till originalNumber becomes 0
        	while(originalNumber != 0){
	    		// Get last digit
        		int digit = originalNumber % 10;  
			// Add cube of digit to sum
            		sum += digit * digit * digit;     
			// Remove last digit
            		originalNumber /= 10;             
        	}


        	// Check if sum of cubes equals to the original number, if equal then it is an armstrong number and if not not equal then it is not an armstrong number
        	if(sum == number){
            		System.out.println(number + " is an Armstrong Number");
        	}else{
            		System.out.println(number + " is not an Armstrong Number");
        	}


        	input.close();
    	}
}
