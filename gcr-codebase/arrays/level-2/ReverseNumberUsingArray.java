import java.util.*;
public class ReverseNumberUsingArray{
    	public static void main(String args[]){

        	Scanner input = new Scanner(System.in);
        	// Take user input
        	int number = input.nextInt();
        	int tempNumber = number;
        	int count = 0;
		// Find count of digits
        	while(tempNumber != 0){
            		tempNumber = tempNumber / 10;
            		count++;
        	}


        	int[] digits = new int[count];
        	int index = 0;

        	// Store digits in array
	        while(number != 0){
            		digits[index] = number % 10;
            		number = number / 10;
            		index++;
        	}

        	int[] reverseDigits = new int[count];
        	// Store digits in reverse order
        	for(int i = 0 ; i < count ; i++){
            		reverseDigits[i] = digits[count - 1 - i];
        	}



        	// Display reversed number
        	for(int i = 0 ; i < count ; i++){
            		System.out.print(reverseDigits[i]);
        	}



	        input.close();
    	}
}
