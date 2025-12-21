import java.util.*;
public class BMICalculator{

    	// Method to calculate BMI and store it in the 3rd column of the array
    	public void calculateBMI(double[][] data){
        	for(int i=0;i<data.length;i++){
            		double weight = data[i][0];          // weight in kg
            		double heightCm = data[i][1];        // height in cm
            		double heightMeter = heightCm / 100; // convert cm to meters
            		double bmi = weight / (heightMeter * heightMeter);
            		data[i][2] = bmi; // store BMI
        	}
    	}



    	// Method to determine BMI status for each person
    	public String[] findBMIStatus(double[][] data){
        String[] status = new String[data.length];

        	for(int i=0;i<data.length;i++){
            		double bmi = data[i][2];

      	    		if (bmi <= 18.4) {
                		status[i] = "Underweight";
            		} 
			else if(bmi >= 18.5 && bmi <= 24.9){
                		status[i] = "Normal";
            		} 
			else if(bmi >= 25.0 && bmi <= 39.9){
                		status[i] = "Overweight";
            		} 	
			else{
                		status[i] = "Obese";
            		}
        	}
        	return status;
    	}



    	// Main method to take input from user and for calling non static methods by creating object of the class
    	public static void main(String[] args){
        	Scanner input = new Scanner(System.in);

        	// 2D array includes weight, height(cm), BMI
        	double[][] personsData = new double[10][3];

        	// Take input for 10 persons
        	for(int i=0;i<10;i++){
            		System.out.println("Enter details for Person " + (i+1));

            		System.out.print("Weight (in kg): ");
            		personsData[i][0] = input.nextDouble();

            		System.out.print("Height (in cm): ");
            		personsData[i][1] = input.nextDouble();
        	}

        	// Create object to call non static methods
        	BMICalculator obj = new BMICalculator();

        	// Call non static methods using object
        	obj.calculateBMI(personsData);
        	String[] bmiStatus = obj.findBMIStatus(personsData);

        	// Display results
        	System.out.println("\nBMI Report");
        	for(int i=0;i<10;i++){
            		System.out.println("Person " + (i+1) + " -> weight: " + personsData[i][0] + " kg, height: " + personsData[i][1] + " cm, BMI: " + personsData[i][2] + ", Status: " + bmiStatus[i]);
        	}

        	input.close();
    	}
}
