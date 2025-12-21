public class NumberCheckerVersionOne{


    // Method to count number of digits in a number
    public static int countDigits(int number){
        // if number is 0, digit count is 1
        if(number == 0){
            return 1;
        }
        int count = 0;
        // Loop until number becomes 0
        while(number != 0){
            count++;          // increase digit count
            number = number / 10; // remove last digit
        }
        return count;
    }


    // Method to store digits of the number into an array
    public static int[] storeDigits(int number){
        // Find total number of digits
        int count = countDigits(number);
        // Create array to store digits
        int[] digits = new int[count];
        // Store digits from last index to first
        for(int i = count - 1; i >= 0; i--){
            digits[i] = number % 10; // get last digit
            number = number / 10;    // remove last digit
        }
        return digits;
    }


    // Method to check Duck Number
    // Duck number means it contains at least one non-zero digit
    public static boolean isDuckNumber(int[] digits){
        for(int i = 0; i < digits.length; i++){
            if(digits[i] != 0){
                return true; // non-zero digit found
            }
        }
        return false;
    }


    // Method to check Armstrong Number
    public static boolean isArmstrongNumber(int number, int[] digits){
        int power = digits.length; // number of digits
        int sum = 0;
        // Calculate sum of digit^power
        for(int i = 0; i < digits.length; i++){
            sum += Math.pow(digits[i],power);
        }
        // Check if sum is equal to original number
        if(sum == number){
            return true;
        } 
	else{
            return false;
        }
    }


    // Method to find largest and second largest digit
    public static int[] findLargestAndSecondLargest(int[] digits){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i < digits.length; i++){
            if(digits[i] > largest){
                secondLargest = largest;
                largest = digits[i];
            } 
            else if(digits[i] > secondLargest && digits[i] != largest){
                secondLargest = digits[i];
            }
        }
        return new int[]{largest, secondLargest};
    }


    // Method to find smallest and second smallest digit
    public static int[] findSmallestAndSecondSmallest(int[] digits){
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int i = 0; i < digits.length; i++){
            if(digits[i] < smallest){
                secondSmallest = smallest;
                smallest = digits[i];
            } 
            else if(digits[i] < secondSmallest && digits[i] != smallest){
                secondSmallest = digits[i];
            }
        }
        return new int[]{smallest, secondSmallest};
    }


}
