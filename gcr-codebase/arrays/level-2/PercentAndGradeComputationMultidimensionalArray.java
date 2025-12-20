import java.util.*;
public class PercentAndGradeComputationMultidimensionalArray{
    	public static void main(String args[]){

        	Scanner input = new Scanner(System.in);
        	// Take input for number of students
        	int numberOfStudents = input.nextInt();

        	// Declaring 2D array to store marks: physics, chemistry, maths 
        	double[][] marks = new double[numberOfStudents][3];
        	double[] percentage = new double[numberOfStudents];
        	char[] grade = new char[numberOfStudents];

        	// Taking input from the user for marks with validation
        	for(int i = 0 ; i < numberOfStudents ; i++){

            		marks[i][0] = input.nextDouble(); // physics
            		marks[i][1] = input.nextDouble(); // chemistry
            		marks[i][2] = input.nextDouble(); // maths

            		if(marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0){
                		i--; // re-enter marks for the same student
            		}
        	}



        	// Calculate percentage and grade of students
        	for(int i = 0 ; i < numberOfStudents ; i++){
			// Calculate the percentage of each student
            		percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;
			// Based on calculated percentage, set the value of grade
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
        	for(int i = 0; i < numberOfStudents; i++){
 			System.out.println(marks[i][0] + "\n" + marks[i][1] + "\n" + marks[i][2] + "\n" + percentage[i] + "\n" + grade[i]);
		}


        	input.close();
    	}
}
