import java.util.*;
public class LeapYearChecker{
	
	// Method to check whether the input year is leap year or not
	public boolean checkingLeapYear(int year){
		// Check for the gregorian calendar
		if(year >= 1582){
			// Check for the conditions required to check for the leap year or not 
			if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
				return true;	
			}else{
				return false;
			}
		}
		return false;
	}


	// Main method to take input year from the user and print the result as true or false
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		// Take the input year from the user
		System.out.print("Enter the year: ");
		int year = input.nextInt();
		
		// Create object to call the non static method
		LeapYearChecker checker = new LeapYearChecker();
		// store the return value of the called method int the result variable
		boolean result = checker.checkingLeapYear(year);

		// Print the result as true or false(Leap year or not)
		System.out.println("Is " + year + " a leap year? " + result);

			
		input.close();
	}

}