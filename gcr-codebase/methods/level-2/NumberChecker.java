import java.util.*;
public class NumberChecker{


    	// Method to check whether number is positive or negative
    	public int checkingPositiveNegativeNumber(int number){
        	if(number > 0){
            		return 1;
        	}
		else if(number < 0){
            		return -1;
        	}
		else{
            		return 0;
        	}
    	}



	// Method to check whether number is even or odd
    	public int checkingEvenOddNumber(int number){
        	if(number % 2 == 0){
            		return 1;
        	}
		else{
            		return -1;
        	}
    	}



    	// Method to compare two numbers
    	public int comparingNumbers(int number1, int number2){
        	if(number1 > number2){
            		return 1;
        	} 
		else if(number1 == number2){
            		return 0;
        	} 
		else{
            		return -1;
        	}
    	}



   	// Main method
    	public static void main(String args[]){
        	Scanner input = new Scanner(System.in);

        	int[] numbers = new int[5];

        	// Take input for 5 numbers
        	System.out.println("Enter 5 numbers:");
        	for(int i=0;i<numbers.length;i++){
            		numbers[i] = input.nextInt();
        	}

        	NumberChecker obj = new NumberChecker();

        	// Check positive/negative and even/odd
        	for(int i=0;i<numbers.length;i++){
            		int num = numbers[i];
            		int result = obj.checkingPositiveNegativeNumber(num);

            		if(result == 1){
                		System.out.print(num + " is Positive and ");
                		int evenOdd = obj.checkingEvenOddNumber(num);

                		if(evenOdd == 1){
                    			System.out.println("Even");
                		} 
				else{
                    			System.out.println("Odd");
                		}
            		} 
			else if(result == -1){
                		System.out.println(num + " is Negative");
            		} 
			else{
                		System.out.println(num + " is Zero");
            		}
        	}

        	// Compare first and last elements
        	int compareResult = obj.comparingNumbers(numbers[0], numbers[numbers.length - 1]);

        	if(compareResult == 1){
            		System.out.println("\nFirst number is greater than last number");
        	} 
		else if(compareResult == 0){
            		System.out.println("\nFirst number is equal to last number");
        	} 
		else{
            		System.out.println("\nFirst number is less than last number");
        	}

        
		input.close();
    	}
}
