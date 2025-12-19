import java.util.*;
public class StudentVotingEligibility{
	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		// Declaring studentAge array of size 10
		int[] studentAge = new int[10];
		// Using for loop to take 10 student's age from the user  
		for(int i = 0 ; i < 10 ; i++){
			studentAge[i] = input.nextInt();
		}	
		


		// Iterating through for loop 
		for(int i = 0 ; i < studentAge.length ; i++){
			
			// Checking if studentAge is negative
			if(studentAge[i] < 0){
				System.out.println("Invalid age");
			}
			
			// Checking for the eligibility of students to vote
			else if(studentAge[i] >= 18){
				System.out.println("The student with the age " + studentAge[i] + " can vote");
			}
			
			// Students those who can't cast their vote
			else{
				System.out.println("The student with the age " + studentAge[i] + " cannot vote");
			}
		}				


		

		input.close();
	}
}