import java.util.*;
public class StudentVotingEligibility{

    	// Method to generate random 2-digit ages for n students
    	public static int[] generateRandomAges(int n){
        	Random random = new Random();
        	int[] ages = new int[n];
        	for(int i = 0; i < n; i++){
            		ages[i] = random.nextInt(100); // 0 to 99
        	}
        	return ages;
    	}


    	// Method to check voting eligibility
    	public static String[][] checkVotingEligibility(int[] ages){
        	String[][] result = new String[ages.length][2];
        	for(int i = 0; i < ages.length; i++){
            	int age = ages[i];
            	result[i][0] = String.valueOf(age);
            	if(age < 0){
                	result[i][1] = "Cannot Vote (Invalid Age)";
            	}
			else if(age >= 18){
                		result[i][1] = "Can Vote";
            		} 
			else{
                		result[i][1] = "Cannot Vote";
            		}
        	}
        	return result;
    	}


    	// Method to display 2D array in tabular format
    	public static void displayResult(String[][] result){
        	System.out.println("Age\tVoting Eligibility");
        	System.out.println("-----------------------------");
        	for(int i = 0; i < result.length; i++){
            		System.out.println(result[i][0] + "\t" + result[i][1]);
        	}
    	}


    	// Main method
    	public static void main(String[] args){
        	Scanner input = new Scanner(System.in);

        	System.out.print("Enter the number of students: ");
        	int n = input.nextInt();

        	int[] ages = new int[n];

        	// Take user input for ages
        	for(int i = 0; i < n; i++){
            		System.out.print("Enter age of student " + (i+1) + ": ");
            		ages[i] = input.nextInt();
        	}

        	// Check voting eligibility
        	String[][] votingResult = checkVotingEligibility(ages);

        	// Display results
        	displayResult(votingResult);

        	input.close();
    	}


}
