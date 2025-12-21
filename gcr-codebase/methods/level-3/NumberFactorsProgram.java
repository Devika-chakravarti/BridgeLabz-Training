import java.util.Scanner;
public class NumberFactorsProgram{


    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number){
        // count number of factors
        int count = 0;
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                count++;
            }
        }
        // store factors in array
        int[] factors = new int[count];
        int index = 0;
        for(int i = 1; i <= number; i++){
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }


    // Method to find the greatest factor of a number
    public static int findGreatestFactor(int[] factors){
        int max = factors[0];
        for(int i = 1; i < factors.length; i++){
            if(factors[i] > max){
                max = factors[i];
            }
        }
        return max;
    }


    // Method to find the sum of factors
    public static int findSumOfFactors(int[] factors){
        int sum = 0;
        for(int i = 0; i < factors.length; i++){
            sum += factors[i];
        }
        return sum;
    }


    // Method to find the product of factors
    public static long findProductOfFactors(int[] factors){
        long product = 1;
        for(int i = 0; i < factors.length; i++){
            product *= factors[i];
        }
        return product;
    }


    // Method to find the product of cubes of factors
    public static long findProductOfCubesOfFactors(int[] factors){
        long product = 1;
        for(int i = 0; i < factors.length; i++){
            product *= (long) Math.pow(factors[i],3);
        }
        return product;
    }


    // Main method to take input and display all factor-related calculations
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Find factors
        int[] factors = findFactors(number);

        // Display factors
        System.out.print("Factors: ");
        for(int i = 0; i < factors.length; i++){
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        // Display greatest factor
        System.out.println("Greatest factor: " + findGreatestFactor(factors));
        // Display sum of factors
        System.out.println("Sum of factors: " + findSumOfFactors(factors));
        // Display product of factors
        System.out.println("Product of factors: " + findProductOfFactors(factors));
        // Display product of cubes of factors
        System.out.println("Product of cubes of factors: " + findProductOfCubesOfFactors(factors));

        input.close();
    }


}
