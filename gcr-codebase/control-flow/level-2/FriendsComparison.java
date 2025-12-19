import java.util.*;
public class FriendsComparison{
	public static void main(String args[]){

        	Scanner input = new Scanner(System.in);

        	// Taking ages of the 3 friends
              	int ageAmar = input.nextInt();
               	int ageAkbar = input.nextInt();
               	int ageAnthony = input.nextInt();

        	// Taking heights of the 3 friends
               	double heightAmar = input.nextDouble();
               	double heightAkbar = input.nextDouble();
               	double heightAnthony = input.nextDouble();



        	// Find youngest friend aomng 3 of them
        	if(ageAmar < ageAkbar && ageAmar < ageAnthony){
			System.out.println("Youngest friend: Amar");
		}
		else if(ageAkbar < ageAmar && ageAkbar < ageAnthony){
			System.out.println("Youngest friend: Akbar");
		}
		else{
			System.out.println("Youngest friend: Anthony");
		}


        	// Find tallest friend among 3 of them
		if(heightAmar > heightAkbar && heightAmar > heightAnthony){
			System.out.println("Tallest friend: Amar");	
		}
		else if(heightAkbar > heightAmar && heightAkbar > heightAnthony){
			System.out.println("Tallest friend: Akbar");
		}else {
			System.out.println("Tallest friend: Anthony");
		}


        
		input.close();
	}
}
