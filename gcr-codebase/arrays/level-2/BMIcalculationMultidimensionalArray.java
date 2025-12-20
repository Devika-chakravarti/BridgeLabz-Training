import java.util.*;
public class BMIcalculationMultidimensionalArray{
	public static void main(String args[]){

        	Scanner input = new Scanner(System.in);
        	// Take input for number of persons
        	int number = input.nextInt();

        	// Delcaring 2D array to store weight, height and BMI
        	double[][] personData = new double[number][3];
        	String[] weightStatus = new String[number];

        	// Take input for weight(in kg) and height(in cm) 
        	for(int i = 0 ; i < number ; i++){
            		personData[i][0] = input.nextDouble(); 
            		personData[i][1] = input.nextDouble();
        	}



        	// Calculate BMI and weight status of the person
        	for(int i = 0 ; i < number ; i++){
			
			// Calculatin BMI by using formula: BMI = weight / ( (heightInCm / 100) * (heightInCm / 100) )
            		personData[i][2] = personData[i][0] / ((personData[i][1] / 100.0) * (personData[i][1] / 100.0));
			// Comparing Calculated BMI with few specific values and show the weight status where that BMI lies
            		if(personData[i][2] <= 18.4){
                		weightStatus[i] = "Underweight";
            		}
			else if(personData[i][2] >= 18.5 && personData[i][2] <= 24.9){
                		weightStatus[i] = "Normal";
            		}
			else if(personData[i][2] >= 25.0 && personData[i][2] <= 39.9){
                		weightStatus[i] = "Overweight";
            		}
			else{
                		weightStatus[i] = "Obese";
            		}
        	}



        	// Display height, weight, BMI and weight status of the person
        	for(int i = 0 ; i < number ; i++){
                	System.out.println(
                    		personData[i][1] + "\n" + personData[i][0] + "\n" + personData[i][2] + "\n" + weightStatus[i]
            		);
        	}



        	input.close();
    	}
}
