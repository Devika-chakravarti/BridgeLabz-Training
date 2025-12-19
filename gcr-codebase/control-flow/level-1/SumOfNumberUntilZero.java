import java.util.*;
public class SumOfNumberUntilZero{
	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		double total = 0.0;
		double value = input.nextDouble();


		// Using while to keep comparing value becomes zero 
		while(value!=0){
			
			// Adding all values and storing it in total variable
			total += value;
			value = input.nextDouble();

		}
		


		// Print total sum of the numbers
		System.out.println(total);


		input.close();
	}
}