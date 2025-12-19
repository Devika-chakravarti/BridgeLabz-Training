import java.util.*;
public class LargestAndSecondLargestDigit{
	public static void main(String args[]){
	
        	Scanner input = new Scanner(System.in);
        	// Taking user input
        	int number = input.nextInt();

		int maxDigit = 10;
        	int[] digits = new int[maxDigit];
        	int index = 0;



	        // using while loop to Store digits in array
        	while(number != 0){
            		digits[index] = number % 10;
            		number = number / 10;
            		index++;

            		if (index == maxDigit) {
                		break;
            		}
        	}

		// Assuming to be 0 as both largest and secondLargest element of the array
        	int largest = 0;
        	int secondLargest = 0;

        	// Find largest and second largest digit
        	for(int i = 0 ; i < index ; i++){
            		if(digits[i] > largest){
                		secondLargest = largest;
                		largest = digits[i];
            		} 
			else if(digits[i] > secondLargest && digits[i] != largest){
                		secondLargest = digits[i];
            		}
        	}


        	// Display largest and second largest digit from the array
        	System.out.println("Largest digit: " + largest);
        	System.out.println("Second largest digit: " + secondLargest);

        

		input.close();
    	}
}
