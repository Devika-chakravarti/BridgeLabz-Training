import java.util.*;
public class HarshadNumber{
	public static void main(String[] args){

        	Scanner input = new Scanner(System.in);
        	int number = input.nextInt();
        	int sum = 0;
		// Storing the user input in temp because after reducing the original number one by one we will only have 0 in the orignal number after the loop which means we can't compute further operation (number % sum == 0)
		int temp = number;


        	while(temp != 0){
			// Add last digit to sum
            		sum += temp % 10;   
			// Remove last digit
            		temp /= 10;         
        	}

	
        	System.out.println((number % sum == 0) ? "Harshad Number" : "Not a Harshad Number");


       		input.close();
    	}
}
