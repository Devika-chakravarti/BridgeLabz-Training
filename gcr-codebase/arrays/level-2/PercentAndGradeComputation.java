import java.util.*;
public class PercentAndGradeComputation{
    	public static void main(String args[]){

        	Scanner input = new Scanner(System.in);
        	// Take input for number of students
        	int numberOfStudents = input.nextInt();

		// Declaring physics, chemistry, maths, percentage and grade array to stores all students details 
        	double[] physics = new double[numberOfStudents];
        	double[] chemistry = new double[numberOfStudents];
        	double[] maths = new double[numberOfStudents];
        	double[] percentage = new double[numberOfStudents];
        	char[] grade = new char[numberOfStudents];

        	// Taking input for marks in physics, chemistry and maths from the user
        	for(int i = 0 ; i < numberOfStudents ; i++){
            		physics[i] = input.nextDouble();
            		chemistry[i] = input.nextDouble();
            		maths[i] = input.nextDouble();
			if(physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0){
				// re-enter marks for the same student
        			i--; 
    			}
	        }


        	// Calculate percentage and setting grade value accordingly
        	for(int i = 0 ; i < numberOfStudents ; i++){
			// Calculating percentage of each student
            		percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3;

            		if(percentage[i] >= 80){
                		grade[i] = 'A';
            		}
			else if(percentage[i] >= 70){
                		grade[i] = 'B';
            		}
			else if(percentage[i] >= 60){
                		grade[i] = 'C';
            		}
			else if(percentage[i] >= 50){
                		grade[i] = 'D';
            		}
			else if(percentage[i] >= 40){
                		grade[i] = 'E';
            		}
			else{
                		grade[i] = 'R';
            		}
        	}
	

        	
		// Display marks, percentage and grade of each student
        	for(int i = 0 ; i < numberOfStudents ; i++){
            		System.out.println(
                		physics[i] + "\n" + chemistry[i] + "\n" + maths[i] + "\n" + percentage[i] + "\n" + grade[i]
            		);
        	}

        
		input.close();
    	}
}
