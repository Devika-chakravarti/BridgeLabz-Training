import java.util.*;
public class ElectionBoothManager{

    // Non-static method to checks if voter is eligible based on age
    public boolean isEligible(int age){
        return age >= 18;
    }

    // Non-static method to ask user for vote and based on that it validates
    public int recordVote(Scanner input){
        int vote;
        while(true){
	    // Keep taking votes from user
            System.out.print("Cast your vote(1, 2, 3 for candidates): ");
            vote = input.nextInt();
            if(vote >= 1 && vote <= 3){
                break;
            } 
	    else{
                System.out.println("Invalid choice! Please vote 1, 2, or 3");
            }
        }
        return vote;
    }

    // Main method to take age input and display the result by calling the non-static method
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

	// Create object to call the non-static method
        ElectionBoothManager booth = new ElectionBoothManager();

        // Initialize vote counters for 3 candidates
        int candidate1 = 0, candidate2 = 0, candidate3 = 0;

	// Using while loop to accept voter ages until user enters -1
        while(true){
	    System.out.print("Enter voter age(or -1 to exit): ");
            int age = input.nextInt();

	    // Exit the voting loop if user enters -1
            if(age == -1){
                break; 
            }

	    // check eligibility and proceed to voting if eligible
            if(booth.isEligible(age)){
                int vote = booth.recordVote(input);
                switch(vote){
                    case 1: candidate1++; break;
                    case 2: candidate2++; break;
                    case 3: candidate3++; break;
                }
                System.out.println("Thank you for voting!\n");
            } 
	    else{
                System.out.println("Sorry! You are not eligible to vote\n");
            }
        }

        // Display final election results
        System.out.println("\nElection Results:");
        System.out.println("Candidate1: " + candidate1 + " votes");
        System.out.println("Candidate2: " + candidate2 + " votes");
        System.out.println("Candidate3: " + candidate3 + " votes");

        input.close();
    }
}
