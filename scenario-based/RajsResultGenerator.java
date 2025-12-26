import java.util.*;
public class RajsResultGenerator{

    // Non-static method to calculate average
    public double calculateAverage(int[] marks){
        int sum = 0;
        for (int i = 0; i < marks.length; i++){
            sum += marks[i];
        }
        return sum / (double)marks.length;
    }

    // Non-static method to assign grade based on average
    public char assignGrade(double avg){
	// Convert average to tens for switch case
        int roundedAvg = (int) avg / 10; 
        char grade;
        switch(roundedAvg){
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }
        return grade;
    }

    // Main method
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

	// Create object to call the non-static method
        RajsResultGenerator raj = new RajsResultGenerator();

	// Create array to store the 5 subject marks
        int[] marks = new int[5];

        // Input marks using for loop
        for(int i = 0; i < 5; i++){
            System.out.print("Enter marks for Subject " + (i+1) + ": ");
            marks[i] = input.nextInt();
        }

        // Calculate average calling non-static method calculateAverage()
        double average = raj.calculateAverage(marks);

        // Assign grade calling non-static method assignGrade()
        char grade = raj.assignGrade(average);

        // Display result
        System.out.println("Marks: " + Arrays.toString(marks));
        System.out.printf("Average: %.2f\n", average);
        System.out.println("Grade: " + grade);

        input.close();
    }
}
