import java.util.*;
public class CountDigits{
	public static void main(String args[]){

        	Scanner input = new Scanner(System.in);
        	int number = input.nextInt();
		// Stores the copy of the number because after reducing the original number in the loop, at the end we will only have 0 not the original number taken from the user
		int temp = number;
		// To store number of digits
        	int count = 0; 
		

       		// Loop until number becomes 0
        	while(temp != 0){
			// Remove last digit
                	temp /= 10; 
			// Increment count
                	count++;    
        	}


		// Print Number of digits
        	System.out.println("Number of digits: " + count);


        	input.close();
    	}
}
