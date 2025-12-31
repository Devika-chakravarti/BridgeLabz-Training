/*
Scenario-based problem: 20

Festival Lucky Draw 
At Diwali mela, each visitor draws a number.
- If the number is divisible by 3 and 5, they win a gift.
- Use if, modulus, and loop for multiple visitors.
- continue if input is invalid.
*/


import java.util.*;
public class FestivalLuckyDraw{

	// Non-static method to handle the lucky draw process
	public void startLuckyDraw(){
		// Scanner object to take user input
		Scanner input = new Scanner(System.in);

		// Variable to control multiple visitors
		char choice = 'y';

		// Display heading
		System.out.println(" ");
		System.out.println("     WELCOME TO DIWALI LUCKY DRAW     ");
		System.out.println("--------------------------------------");

		// Loop to allow multiple visitors to participate
		do{
			// Ask the visitor to enter a number
			System.out.print("\nEnter your lucky number: ");
			int number = input.nextInt();

			// Check if the entered number is invalid
			if(number <= 0){
				System.out.println("Invalid number! (Enter a positive number)");
				continue;
			}

			// Check if number is divisible by both 3 and 5
			if(number % 3 == 0 && number % 5 == 0){
				System.out.println("Congratulations!\nYou won a gift.");
			}else{
				System.out.println("Sorry!\nBetter luck next time.");
			}

			// Ask if another visitor wants to try
			System.out.print("Is there another visitor? (y/n): ");
			choice = input.next().charAt(0);

		}while(choice=='y' || choice=='Y');

		System.out.println("\nThankyou for visiting the Diwali Lucky Draw");
	}

	// Main method to call the non-static method
	public static void main(String args[]){
		// Create object to call non-static method
		FestivalLuckyDraw draw = new FestivalLuckyDraw();
		draw.startLuckyDraw();
	}
}
