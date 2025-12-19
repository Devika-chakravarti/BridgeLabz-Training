import java.util.*;
public class CalculatorSwitch{
	public static void main(String args[]){

        	Scanner input = new Scanner(System.in);
        	double first = input.nextDouble();
        	double second = input.nextDouble();
		// The input for the operator can only be one of the four values: "+", "-", "*" or "/"
        	String op = input.next();
        	
		double result;

        	// Using switch case to perform the operations
        	switch(op){
			// Performing addtion operation
            		case "+":
                		result = first + second;
                		System.out.println("Result: " + result);
                		break;
			// Performing subtraction operation
            		case "-":
                		result = first - second;
                		System.out.println("Result: " + result);
                		break;
			// Performing multiplication operation
            		case "*":
                		result = first * second;
                		System.out.println("Result: " + result);
                		break;
			// Performing division operation(Handle case when second number can't be zero because it will throw an error)
            		case "/":
                		if(second != 0){
                    			result = first / second;
                    			System.out.println("Result: " + result);
                		}else{
                    			System.out.println("Error: Division by zero");
                		}
                		break;
			// Print Invalid Operator in case the op is neither "+", "-", "*" or "/"
            		default:
                		System.out.println("Invalid Operator");
        	}

	
		input.close();
    	}
}
