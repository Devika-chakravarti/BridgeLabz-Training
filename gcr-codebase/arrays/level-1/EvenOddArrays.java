import java.util.*;
public class EvenOddArrays{
	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		int number = input.nextInt();


		// Check for negative number and zero, if found then print An error
		if(number <= 0){
			System.out.println("An error");
			return;
		}		

		
		// Declaring oddArray and evenArray of size number / 2 + 1
		int[] oddArray = new int[number / 2 + 1];
        	int[] evenArray = new int[number / 2 + 1];


                int oddIndex = 0;
        	int evenIndex = 0;


        	// Store odd and even numbers
        	for(int i = 1 ; i <= number ; i++){
            		if(i % 2 == 0){
                		evenArray[evenIndex] = i;
                		evenIndex++;
            		}
			else{
                		oddArray[oddIndex] = i;
                		oddIndex++;
            		}
        	}

                
		// Print the even and odd numbers using evenIndex and oddIndex
        	for(int i = 0 ; i < evenIndex ; i++){
            		System.out.print("Even number: " + evenArray[i] + "\n");
        	}
		System.out.println();
        	for(int i = 0 ; i < oddIndex ; i++){
            		System.out.print("Odd number: " + oddArray[i] + "\n");
        	}


		input.close();
	}
}