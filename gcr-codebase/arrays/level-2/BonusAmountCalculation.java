import java.util.*;
public class BonusAmountCalculation{
	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		
		// Arrays of double datatype to store data of 10 employees
        	double[] salary = new double[10];
        	double[] yearsOfService = new double[10];
        	double[] bonusAmount = new double[10];
        	double[] newSalary = new double[10];

	        double totalBonus = 0;
        	double totalOldSalary = 0;
        	double totalNewSalary = 0;

        	// using for loop take input for salary and years of service
        	for(int i = 0 ; i < 10 ; i++){

            		System.out.println("Enter details for Employee " + (i + 1));
            		salary[i] = input.nextDouble();
            		yearsOfService[i] = input.nextDouble();

			// Validation check
            		if(salary[i] <= 0 || yearsOfService[i] < 0){
                		System.out.println("Invalid input");
				// decrement index to re-enter the data
                		i--; 
                		continue;
            		}
        	}

        	// Calculating bonus, new salary, and totals
        	for(int i = 0 ; i < 10 ; i++){

            		if(yearsOfService[i] > 5){
                		bonusAmount[i] = salary[i] * 0.05;
            		}
			else{
                		bonusAmount[i] = salary[i] * 0.02;
            		}

            		newSalary[i] = salary[i] + bonusAmount[i];

            		totalBonus += bonusAmount[i];
            		totalOldSalary += salary[i];
            		totalNewSalary += newSalary[i];
        	}

        	// Display results
		System.out.println("\n");
        	System.out.println("Total Bonus Payout: " + totalBonus);
        	System.out.println("Total Old Salary: " + totalOldSalary);
        	System.out.println("Total New Salary: " + totalNewSalary);


		input.close();

	}
}