import java.util.*;
public class BMIFitnessTracker{


    // Method to calculate BMI of clients
    public double[] calculateBMI(double[] heights,double[] weights){
        
	    // bmi array with size of heights array(which simply means number of clients)
        double[] bmi = new double[heights.length];
	
	    // using for loop to iterate through the height array and first convert height(in centimeters) to height(in meters) and then calculate BMI
        for(int i = 0; i < heights.length; i++){

            // Convert height from cm to meters
            double heightInMeters = heights[i] / 100;

            // Calculate BMI
            double bmiValue = weights[i] / (heightInMeters * heightInMeters);

            // Round BMI to 2 decimal places
            bmi[i] = Math.round(bmiValue * 100.0) / 100.0;
        }
        return bmi;
    }


    // Main method to take input the number of clients, heights(in cm) and weights(in kg) of the clients and then display the calculated BMI 
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        // Take number of clients
        System.out.print("Enter the number of clients: ");
        int numberOfClients = input.nextInt();
	    System.out.println();

        // Declare height and weight arrays 
        double[] heights = new double[numberOfClients];
        double[] weights = new double[numberOfClients];

        // Take heights(in cm) of the clients
        for(int i = 0; i < numberOfClients; i++){
	    System.out.print("Enter the height(in cm) of client " + (i+1) + ": ");
            heights[i] = input.nextDouble();
        }
	    System.out.println();

        // Take weights(in kg) of the clients
        for(int i = 0; i < numberOfClients; i++){
	    System.out.print("Enter the weight(in kg) of client " + (i+1) + ": ");
            weights[i] = input.nextDouble();
        }
	    System.out.println();

        // Create object to call the non-static method calculateBMI() 
        BMIFitnessTracker obj = new BMIFitnessTracker();

        // Call method by using object
        double[] calculatedBMI = obj.calculateBMI(heights,weights);

        // Display calculated BMI and category in which it belongs to(whether Underweight, Normal or Overweight)
        for(int i = 0; i < calculatedBMI.length; i++){
            System.out.println("\nClient " + (i+1) + " BMI: " + calculatedBMI[i]);

            if(calculatedBMI[i] < 18.5){
                System.out.println("Category: Underweight");
            } 
            else if(calculatedBMI[i] >= 18.5 && calculatedBMI[i] < 25.0){
                System.out.println("Category: Normal");
            } 
            else{
                System.out.println("Category: Overweight");
            }
        }
        input.close();
    }


}
