import java.util.*;
public class PercentageCalculation{
	public static void main(String args[]){
	
        	Scanner input = new Scanner(System.in);
		// Take input marks from user for the subjects physics, chemistry and maths
		double physics = input.nextDouble();
		double chemistry = input.nextDouble();
		double maths = input.nextDouble();


		// Calculate percentage
		double percent = (physics + chemistry + maths) / 3;
		

		// Displaying grade based on the percentage
		if(percent >= 80){
			System.out.println("Percentage: " + percent + " %" + "\n" + "Grade: A" + "\n" + "Remark: Level 4, above agency-normalized standards");
		}
		else if(percent >= 70 && percent <= 79){
			System.out.println("Percentage: " + percent + " %" + "\n" + "Grade: B" + "\n" + "Remark: Level 3, at agency-normalized standards");
		}
		else if(percent >= 60 && percent <= 69){
			System.out.println("Percentage: " + percent + " %" +  "\n" + "Grade: C" + "\n" + "Remark: Level 2, below, but approaching agency-normalized standards");
		}
		else if(percent >= 50 && percent <= 59){
			System.out.println("Percentage: " + percent + " %" + "\n" + "Grade: D" + "\n" + "Remark: Level 1, well below agency-normalized standards");
		}
		else if(percent >= 40 && percent <= 49){
			System.out.println("Percentage: " + percent + " %" + "\n" + "Grade: E" + "\n" + "Remark: Level 1-, too below agency-normalized standards");
		}
		else{
			System.out.println("Percentage: " + percent + " %" + "\n" + "Grade: R" + "\n" + "Remark: Remedial standards");
		}


        	
        	input.close();
	}
}
