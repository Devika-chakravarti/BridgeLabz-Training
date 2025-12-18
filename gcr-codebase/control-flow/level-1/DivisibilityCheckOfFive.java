import java.util.Scanner;
public class DivisibilityCheckOfFive{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();


		// Checking whether the integer input taken from user is divisible by five or not(using if-else conditionals)
		if(number % 5 == 0){
			System.out.println("Is the number " + number + " divisible by 5?" + " YES ");	
		}
		else{
			System.out.println("Is the number " + number + " divisible by 5?" + " NO ");
		}


	}
}