import java.util.*;
public class StudentVoteChecker{
	
	// Method to check whether a student can vote or not
	public boolean canStudentVote(int age){
		// Check for negative age
		if(age < 0){
			return false;
		}

		// Check for positive age
		if(age >= 18){
			return true;
		}
		else{
			return false;
		}
	}

	
	// Main method to take students age input and call the other method to display the result
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
	
		// Take students age from the user and store them in array studentsAge
		int[] studentsAge = new int[10];
		for(int i=0;i<10;i++){
			studentsAge[i] = input.nextInt();
		}

		// Create object to call the non static method
		StudentVoteChecker obj = new StudentVoteChecker();
		
		// Print the result
		for(int i=0;i<10;i++){
			boolean result = obj.canStudentVote(studentsAge[i]);
			System.out.println("Student" + (i+1) + " can vote: " + result);
		}
		

		input.close();
	}
	
}