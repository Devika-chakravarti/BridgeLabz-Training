import java.util.*;
public class BMICalculator{

    // Method to calculate BMI and status for one person
    public String[] calculateBMI(double weight,double heightCm){
        double heightMeter=heightCm/100;
        double bmi=weight/(heightMeter*heightMeter);
        String status;

        if(bmi<=18.4){
            status="Underweight";
        }else if(bmi<=24.9){
            status="Normal";
        }else if(bmi<=39.9){
            status="Overweight";
        }else{
            status="Obese";
        }

        return new String[]{String.format("%.2f",bmi),status};
    }

    // Method that takes the 2D array of height and weight as parameters
    public String[][] processBMI(double[][] data){
        String[][] result=new String[data.length][4];

        // Compute BMI and status for each person
        for(int i=0;i<data.length;i++){
            String[] bmiResult=calculateBMI(data[i][0],data[i][1]);
            result[i][0]=String.valueOf(data[i][1]);
            result[i][1]=String.valueOf(data[i][0]);
            result[i][2]=bmiResult[0];
            result[i][3]=bmiResult[1];
        }
        return result;
    }

    // Method to display the 2D string array in a tabular format of Person's Height, Weight, BMI, and the Status
    public void displayResult(String[][] result){
        System.out.println("Height(cm)\tWeight(kg)\tBMI\tStatus");
        for(int i=0;i<result.length;i++){
            System.out.println(result[i][0]+"\t\t"+result[i][1]+"\t\t"+result[i][2]+"\t"+result[i][3]);
        }
    }

    // Main method to take user inputs, calls the user-defined methods, and displays the result
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        BMICalculator obj=new BMICalculator();

        double[][] data=new double[10][2];

        // Taking height and weight input from the user
        for(int i=0;i<10;i++){
            System.out.print("Enter weight(kg) of person "+(i+1)+": ");
            data[i][0]=input.nextDouble();
            System.out.print("Enter height(cm) of person "+(i+1)+": ");
            data[i][1]=input.nextDouble();
        }

        String[][] result=obj.processBMI(data);
        obj.displayResult(result);

	    input.close();
    }
}
