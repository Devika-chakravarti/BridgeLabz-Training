import java.util.*;
public class DigitFrequencyUsingArray{
	public static void main(String args[]){

        	Scanner input = new Scanner(System.in);
        	// Take input number
        	int number = input.nextInt();
        	int tempNumber = number;

        	int count = 0;
        	// Find count of digits
        	while(tempNumber != 0){
            		tempNumber = tempNumber / 10;
            		count++;
        	}


		// Array to store the digits
        	int[] digits = new int[count];
        	int index = 0;
        	// Store digits in array
        	while(number != 0){
            		digits[index] = number % 10;
           	 	number = number / 10;
            		index++;
        	}	
        	int[] frequency = new int[10];
        	// Find frequency of each digit
        	for(int i = 0 ; i < count ; i++){
            		frequency[digits[i]]++;
        	}



        	// Display frequency
        	for(int i = 0 ; i < 10 ; i++){
            		if(frequency[i] > 0){
                		System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            		}
        	}



	        input.close();
    	}
}
