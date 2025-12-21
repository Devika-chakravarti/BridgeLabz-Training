import java.util.*;
public class PercentAndGradeComputation{


    // Method to generate random 2-digit Physics, Chemistry and Maths marks for students
    // Returns a 2D array includes rows = students and columns = Physics, Chemistry, Maths
    public static int[][] generatePCMMarks(int students){
        int[][] marks = new int[students][3];
        for(int i = 0; i < students; i++){
            for(int j = 0; j < 3; j++){
                marks[i][j] = 10 + (int)(Math.random() * 90); // 2-digit marks (10–99)
            }
        }
        return marks;
    }


    // Method to calculate total, average, and percentage
    // Returns a 2D array includes Total, Average, Percentage
    public static double[][] calculateResult(int[][] marks){
        double[][] result = new double[marks.length][3];
        for(int i = 0; i < marks.length; i++){
            int total = 0;
            for(int j = 0; j < 3; j++){
                total += marks[i][j];
            }
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            // Round off to 2 digits
            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return result;
    }


    // Method to determine grade based on percentage
    public static String getGrade(double percentage){
        if(percentage >= 80) return "A";
        else if(percentage >= 70) return "B";
        else if(percentage >= 60) return "C";
        else if(percentage >= 50) return "D";
        else if(percentage >= 40) return "E";
        else return "R";
    }


    // Method to display scorecard
    public static void displayScoreCard(int[][] marks, double[][] result){
        System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");

        for(int i = 0; i < marks.length; i++){
            System.out.print((i + 1) + "\t");

            for(int j = 0; j < 3; j++){
                System.out.print(marks[i][j] + "\t\t");
            }
            System.out.print((int)result[i][0] + "\t");
            System.out.print(result[i][1] + "\t");
            System.out.print(result[i][2] + "\t\t");
            System.out.println(getGrade(result[i][2]));
        }
    }


    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Take number of students
        System.out.print("Enter number of students: ");
        int students = input.nextInt();

        // Generate marks
        int[][] marks = generatePCMMarks(students);

        // Calculate total, average, percentage
        double[][] result = calculateResult(marks);

        // Display scorecard
        displayScoreCard(marks, result);

        input.close();
    }


}
