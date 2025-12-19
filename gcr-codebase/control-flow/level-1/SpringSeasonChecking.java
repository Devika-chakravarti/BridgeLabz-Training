public class SpringSeasonChecking{
	public static void main(String args[]){
		
		// Taking two int values from the command line
		int month = Integer.parseInt(args[0]);
		int day = Integer.parseInt(args[1]);
		

		if((month == 3 && day >= 20) || month == 4 || month == 5 || (month == 6 && day <= 200)){
			System.out.println("Its a Spring Season");
		}
		else{
			System.out.println("Not a Spring Season");			
		}

	}
}