import java.util.*;
public class EmployeeBonus{
	public static void main(String args[]){

        	Scanner input = new Scanner(System.in);
		double salary = input.nextDouble();
        	int yearsOfService = input.nextInt();


	        // Check if employee is eligible for bonus
        	if(yearsOfService > 5){
			// Calculate bonus
            		double bonus = salary * 0.05;
            		System.out.println("Bonus amount: " + bonus);
        	}

		// Otherwise not eligible for bonus which means no bonus at all
		else{
            		System.out.println("Bonus amount: 0");
        	}


	        input.close();
    	}
}
