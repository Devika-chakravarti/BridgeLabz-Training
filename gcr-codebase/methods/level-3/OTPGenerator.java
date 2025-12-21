import java.util.Scanner;
public class OTPGenerator{


    // Method to generate a 6-digit OTP using Math.random()
    public static int generateOTP(){
        // Using Math.random() generates a double between 0.0 and 1.0
        // Multiply by 900000 to get range 0-899999, then add 100000 to make it 100000-999999
        return (int)(Math.random() * 900000) + 100000;
    }


    // Method to check if all OTPs in an array are unique
    public static boolean areOTPsUnique(int[] otps){
        for(int i = 0; i < otps.length; i++){
            for(int j = i + 1; j < otps.length; j++){
                if(otps[i] == otps[j]){
		    // Duplicate found
                    return false; 
                }
            }
        }
	// All OTPs are unique
        return true; 
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
	// Array to store 10 OTPs
        int[] otpArray = new int[10]; 
        // Generate 10 OTPs
        for(int i = 0; i < 10; i++){
            otpArray[i] = generateOTP();
        }

        // Display all generated OTPs
        System.out.println("Generated OTPs:");
        for(int i = 0; i < 10; i++){
            System.out.println("OTP " + (i + 1) + ": " + otpArray[i]);
        }

        // Check uniqueness
        if(areOTPsUnique(otpArray)){
            System.out.println("\nAll OTPs are unique");
        } 
	else{
            System.out.println("\nDuplicate OTPs found");
        }

        input.close();
    }


}
