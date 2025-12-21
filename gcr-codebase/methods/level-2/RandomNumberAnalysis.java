import java.util.*;
public class RandomNumberAnalysis{


    	// Method to generate an array of 4-digit random numbers
    	public int[] generate4DigitRandomArray(int size){
        	int[] numbers = new int[size];

        	for(int i=0;i<size;i++){
            		// Generates random 4-digit number (between 1000 and 9999)
            		numbers[i] = 1000 + (int)(Math.random() * 9000);
        	}

        	return numbers;
    	}



    	// Method to find average, minimum, and maximum of the array
    	public double[] findAverageMinMax(int[] numbers){
        	int sum = 0;
        	int min = numbers[0];
        	int max = numbers[0];

        	for(int i=0;i<numbers.length;i++){
           		sum += numbers[i];
            		min = Math.min(min,numbers[i]);
            		max = Math.max(max,numbers[i]);
        	}

        	double average = (double) sum / numbers.length;

        	return new double[]{average,min,max};
    	}



    	// Main method
    	public static void main(String args[]){

        	RandomNumberAnalysis obj = new RandomNumberAnalysis();

        	// Generate 5 random 4-digit numbers
        	int[] randomNumbers = obj.generate4DigitRandomArray(5);

        	// Display generated numbers
        	System.out.println("Generated 4-digit random numbers:");
        	for(int i=0;i<randomNumbers.length;i++){
            		System.out.print(randomNumbers[i] + " ");
        	}

        	// Find average, min and max
        	double[] result = obj.findAverageMinMax(randomNumbers);

        	// Display results
        	System.out.println("\n\nAverage value: " + result[0]);
        	System.out.println("Minimum value: " + (int)result[1]);
        	System.out.println("Maximum value: " + (int)result[2]);
    	}
}
