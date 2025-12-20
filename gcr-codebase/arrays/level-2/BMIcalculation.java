import java.util.*;
public class BMIcalculation{
	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		// Taking input for number of persons from the user
		int numberOfPersons = input.nextInt();

		double[] weight = new double[numberOfPersons];
        	double[] height = new double[numberOfPersons];
        	double[] bmi = new double[numberOfPersons];
        	String[] weightStatus = new String[numberOfPersons];
		
		// Taking input for weight and height from the user and storing them in weight and height array
        	for(int i = 0 ; i < numberOfPersons ; i++){
            		weight[i] = input.nextDouble();
            		height[i] = input.nextDouble();
        	}
		

		
		// Calculate BMI and weight status by using the height and weight input taken from the user
        	for(int i = 0 ; i < numberOfPersons ; i++){
			// Formula to calculate the BMI of a person	
            		bmi[i] = weight[i] / (height[i] * height[i]);
			// Checking BMI values and show the weight status of the person accordingly
            		if(bmi[i] <= 18.4){
                		weightStatus[i] = "Underweight";
            		}
			else if(bmi[i] >= 18.5 && bmi[i] <= 24.9){
                		weightStatus[i] = "Normal";
            		}
			else if(bmi[i] >= 25.0 && bmi[i] <= 39.9){
                		weightStatus[i] = "Overweight";
            		}
			else{
                		weightStatus[i] = "Obese";
            		}
        	}	
	


		// Display height, weight, BMI, and weight status of the person
        	for(int i = 0 ; i < numberOfPersons ; i++){
                	System.out.println(height[i] + "\n" + weight[i] + "\n" + bmi[i] + "\n" + weightStatus[i]);
        	}
	
		input.close();
	
	}
}