/*
Scenario-based problem: 7

The Number Guessing Game 
A game asks the player to guess a number between 1 and 100.
Core Java Scenario Based Problem Statements
- Use do-while loop.
- Give hints like "Too high" or "Too low".
- Count attempts and exit after 5 wrong tries.
*/


import java.util.*;
public class NumberGuessingGame{

    // Non-static method to guess the number
    public void guessingNumber(){

        Scanner input = new Scanner(System.in);

        // Generate a random number between 1 and 100
        int targetNumber = (int)(Math.random() * 100) + 1;

        int guess;
        int attempts = 0;
        int maxAttempts = 5;

	// Using do-while loop to keep taking input from the user and checking for too high and low 
        do{
            System.out.print("Enter a number (between 1 and 100): ");
            guess = input.nextInt();
            attempts++;

	    // Check if the number guessed is higher than the target
            if(guess > targetNumber){
                System.out.println("Too high");
            }
	    // Check if the number guessed is smaller than the target 
            else if(guess < targetNumber){
                System.out.println("Too low");
            } 
            else{
                System.out.println("\nCONGRATULATIONS!" + "\n" + "You guessed it right in " + attempts + " attempts");
                return; 
            }

        }
	// Check until the attempts becomes more than the maxAttempts(i.e. 5)
	while(attempts < maxAttempts);

        System.out.println("\nYou've used all 5 attempts" + "\n" + "GAME OVER!!!");
        System.out.println("\nThe correct number was: " + targetNumber);
    }

    // Main method to call the non-static method
    public static void main(String args[]){

        System.out.println("--- WELCOME TO OUR NUMBER GUESSING GAME ---");
	System.out.println("-----------I hope you'll enjoy it-----------\n");

        // Create object to call the non-static method
        NumberGuessingGame obj = new NumberGuessingGame();
        obj.guessingNumber();
    }
}


