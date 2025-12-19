import java.util.*;
public class LeapYear{
    	public static void main(String args[]){


        	Scanner input = new Scanner(System.in);
        	int year = input.nextInt();


        	// Check for Gregorian calendar year
        	if(year >= 1582){

            		// First part is Using multiple if-else statements
            		if(year % 4 != 0){
                		System.out.println(year + " is not a Leap Year");
            		}else{
                		if(year % 100 != 0){
                    			System.out.println(year + " is a Leap Year");
                		}else{
                    			if(year % 400 == 0){
                        			System.out.println(year + " is a Leap Year");
                    			}else{
                        			System.out.println(year + " is not a Leap Year");
                    			}
                		}
        	    	}


            		// Second part is Using single if with logical operators
            		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                		System.out.println(year + " is a Leap Year");
            		}else{
                		System.out.println(year + " is not a Leap Year");
            		}

        	}else{
            		System.out.println("Year must be >= 1582 for Gregorian calendar");
        	}


        	input.close();
    	}
}
