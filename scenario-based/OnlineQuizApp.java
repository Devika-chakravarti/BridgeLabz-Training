/*
Scenario-based problem: 17

Online Quiz Application 
Ask 5 questions (MCQs) from a user.
- Use arrays and for-loop.
- Record score.
- Switch for answer checking. Apply clear indentation and structured layout.
*/


import java.util.*;
public class OnlineQuizApp{

	// Variable to store user's score
	int score = 0;

	// Non-static method to check answer for a question
	public void checkAnswer(int userAnswer,int correctAnswer){
		// Using switch to check if the answer is valid and correct
		switch(userAnswer){
			// If user selects a valid option
			case 1,2,3,4:
				// Compare user answer with correct answer
				if(userAnswer==correctAnswer){
					System.out.println("CORRECT");
					// Increment score if answer is correct
					score++;
				}else{
					System.out.println("WRONG");
				}
				break;
			// If user enters an invalid option
			default:
				System.out.println("Invalid option!!");
		}
	}

	// Main method
	public static void main(String args[]){
		// Scanner object to take user input
		Scanner input = new Scanner(System.in);
		// Create object of OnlineQuizApp to call non-static method
		OnlineQuizApp quiz = new OnlineQuizApp();

		// Array of Java programming questions
		String questions[] = {
			"What is the size of int in Java?\n1. 8 bit\n2. 16 bit\n3. 32 bit\n4. 64 bit",
			"Which of these is a valid keyword in Java?\n1. interface\n2. implements\n3. inherit\n4. inheritence",
			"Which method is the entry point of a Java program?\n1. start()\n2. main()\n3. run()\n4. init()",
			"What is the default value of a boolean variable in Java?\n1. true\n2. false\n3. 0\n4. null",
			"Which of these is used for single-line comments in Java?\n1. /* comment */\n2. // comment\n3. <!-- comment -->\n4. # comment"
		};

		// Array of correct options (answer key)
		int answers[] = {3,2,2,2,2};

		// Print quiz heading
		System.out.println(" ");
		System.out.println("    WELCOME TO THE ONLINE JAVA QUIZ    ");
		System.out.println("----------------------------------------");

		// Loop through each question
		for(int i=0; i<questions.length; i++){
			// Display question number and the question
			System.out.println("\nQuestion "+(i+1)+":");
			System.out.println(questions[i]);
			// Take user's answer as input
			System.out.print("Enter your option (1-4): ");
			int userAnswer = input.nextInt();

			// Call non-static method to check answer and update score
			quiz.checkAnswer(userAnswer,answers[i]);
		}

		// Print quiz summary
		System.out.println("\nQUIZ OVER");
		System.out.println("Your Score: "+quiz.score+" out of "+questions.length);
	}
}
