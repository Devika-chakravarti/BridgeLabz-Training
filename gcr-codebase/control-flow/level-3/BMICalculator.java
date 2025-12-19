import java.util.*;
public class BMICalculator{
	public static void main(String args[]){

        	Scanner input = new Scanner(System.in);	
		// User input weight (in kg) of the person
        	double weight = input.nextDouble();
		// User input height (in cm) for the person
        	double heightCm = input.nextDouble();


        	// Convert height from cm to meter
        	double heightM = heightCm / 100;
		
		// Calculate BMI by using formula 
        	double bmi = weight / (heightM * heightM);
        	

        	// Determine the weight status of the person based on calculated BMI
        	if(bmi <= 18.4){
            		System.out.println("Underweight");
        	}else if(bmi > 18.5 && bmi < 24.9){
            		System.out.println("Normal");
        	}else if(bmi > 25.0 && bmi < 39.9){
            		System.out.println("Overweight");
        	}else{
            		System.out.println("Obese");
        	}


        	input.close();
    	}
}
