import java.util.*;
public class SpringSeasonChecker{


	// Method to check whether the given month and day comes under the category of spring season
	public boolean checkSpringSeason(int month, int day){
		// Check whether it is spring season, if yes then return true
		if((month == 3 && day >= 20 && day <= 31) || (month == 4 && day >= 1 && day <= 30) || (month == 5 && day >= 1 && day <= 31 ) || (month == 6 && day <= 20 && day >= 1)){
			return true;	
		}
		// otherwise return false
		else{
			return false;
		}
	}


	// Main method to take input from the command line and a object checker is created to call the checkSpringSeason method and print The given month and dates are of spring season or not
	public static void main(String args[]){
		
		// Take input through the command line
		int month = Integer.parseInt(args[0]);
		int day = Integer.parseInt(args[1]);

		SpringSeasonChecker checker = new SpringSeasonChecker();
		
		boolean result = checker.checkSpringSeason(month, day);		

		System.out.println("Is this Spring season? " + result);

	}
}