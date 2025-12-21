import java.util.*;
public class Quadratic{

    	// Method to find the roots of a quadratic equation
    	public static double[] findRoots(double a,double b,double c){

        	// Calculate delta
        	double delta = Math.pow(b,2) - 4*a*c;

        	// If delta is positive which means two real roots
        	if(delta > 0){
            		double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            		double root2 = (-b - Math.sqrt(delta)) / (2 * a);
					// returns array of size 2 if two real roots exist
            		return new double[]{root1,root2};
        	}

        	// If delta is zero which means one real root
        	else if(delta == 0){
            		double root = -b / (2 * a);
					// returns array of size 1 if only one real root exists
            		return new double[]{root};
        	}

        	// If delta is negative which means no real roots
        	else{
					// returns mpty array if no real roots exist
            		return new double[]{};
        	}
    	}


    	// Main method
    	public static void main(String args[]){
        	Scanner input = new Scanner(System.in);

        	// Take input values
        	System.out.print("Enter value of a: ");
        	double a = input.nextDouble();

        	System.out.print("Enter value of b: ");
        	double b = input.nextDouble();

        	System.out.print("Enter value of c: ");
        	double c = input.nextDouble();

        	// Check if 'a' is zero (not a quadratic equation)
        	if(a == 0){
            		System.out.println("This is not a quadratic equation.");
            		return;
        	}

        	// Find roots
        	double[] roots = findRoots(a,b,c);

        	// Display result
        	if(roots.length == 2){
            		System.out.println("Two real roots are:");
            		System.out.println("Root 1: " + roots[0]);
            		System.out.println("Root 2: " + roots[1]);
        	}	 
        	else if(roots.length == 1){
            		System.out.println("One real root is:");
            		System.out.println("Root: " + roots[0]);
        	} 
        	else{
            		System.out.println("No real roots exist.");
        	}


	        input.close();
    	}
}