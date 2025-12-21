public class NumberCheckerVesionTwo{


    // Method to count digits in a number
    public static int countDigits(int number){
        // Special case for 0
        if(number == 0){
            return 1;
        }
        int count = 0;
        // Remove digits one by one
        while(number != 0){
            count++;
            number = number / 10;
        }
        return count;
    }


    // Method to store digits of a number into an array
    public static int[] storeDigits(int number){
        int count = countDigits(number);
        int[] digits = new int[count];
        // Store digits from last index
        for(int i = count - 1; i >= 0; i--){
            digits[i] = number % 10;
            number = number / 10;
        }
        return digits;
    }


    // Method to find sum of digits using digits array
    public static int sumOfDigits(int[] digits){
        int sum = 0;
        for(int i = 0; i < digits.length; i++){
            sum += digits[i];
        }
        return sum;
    }


    // Method to find sum of squares of digits
    public static int sumOfSquaresOfDigits(int[] digits){
        int sum = 0;
        for(int i = 0; i < digits.length; i++){
            sum += Math.pow(digits[i], 2);
        }
        return sum;
    }
  	

    // Method to check if number is Harshad number
    public static boolean isHarshadNumber(int number, int[] digits){
        int sum = sumOfDigits(digits);
        // A Harshad number is divisible by sum of its digits
        if(number % sum == 0){
            return true;
        }
        return false;
    }


    // Method to find frequency of each digit
    // Create 2D array which has digit in 1st column, frequency in 2nd column
    public static int[][] digitFrequency(int[] digits){
        int[][] freq = new int[10][2];
        // Initialize digit column
        for(int i = 0; i < 10; i++){
            freq[i][0] = i;
            freq[i][1] = 0;
        }
        // Count frequency of each digit
        for(int i = 0; i < digits.length; i++){
            freq[digits[i]][1]++;
        }
        return freq;
    }


}
