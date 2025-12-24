import java.util.*;
public class NumberGuessingGame{

    // Non-static method to generate a random guess within the range
    public int generateGuess(int low, int high){
        Random rand = new Random();
        return rand.nextInt(high - low + 1) + low;
    }

    // Non-static method to get user feedback on the guess
    public String getFeedback(int guess){
        Scanner input = new Scanner(System.in);
        System.out.print("Is your number " + guess + "? (high/low/correct): ");
        return input.nextLine();
    }

    // Method to guess the correct number
    public void playGame(){
        int low = 1;
        int high = 100;
        int guess;
        String feedback;

        // using equalsIgnoreCase() method to ignore this case sensitivity HiGh = HIGH = high
        while(true){
            guess = generateGuess(low, high);
            feedback = getFeedback(guess);

            if(feedback.equalsIgnoreCase("correct")){
                System.out.println("The computer guessed your number: " + guess);
                break;
            }
            else if(feedback.equalsIgnoreCase("high")){
                // Guess is too high then reduce upper limit
                high = guess - 1;
            }
            else if(feedback.equalsIgnoreCase("low")){
                // Guess is too low then increase lower limit
                low = guess + 1;
            }
            else{
                System.out.println("Please enter valid feedback: high, low, or correct");
            }
        }
    }

    // Main method to call the playGame() method and display the result
    public static void main(String[] args){
        NumberGuessingGame obj = new NumberGuessingGame();
        obj.playGame();
    }
}
