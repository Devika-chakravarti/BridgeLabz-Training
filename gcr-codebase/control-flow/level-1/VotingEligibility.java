import java.util.*;
public class VotingEligibility{
	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		int age = input.nextInt();

		
		// Check if the person can vote or not depends on If the person's age is greater or equal to 18
		// Using if block (a person can vote) 
		if(age >= 18){
			System.out.println("The person's age is " + age + " and can vote.");
		}
	
		// Using else block (a person can't vote)
		else{
			System.out.println("The person's age is " + age + " and cannot vote.");
		}

	}
}