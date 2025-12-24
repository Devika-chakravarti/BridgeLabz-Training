import java.util.*;
public class StudentScoreCard{

    //Static method that generates random 2-digit marks for physics,chemistry and maths
    public static int[][] generatePCMMarks(int students){
        int[][] pcm=new int[students][3];
        
	    Random r=new Random();
        
	    for(int i=0;i<students;i++){
	        //physics marks between 10 and 99
            pcm[i][0]=r.nextInt(90)+10;
            //chemistry marks between 10 and 99
	        pcm[i][1]=r.nextInt(90)+10;
	        //maths marks between 10 and 99
            pcm[i][2]=r.nextInt(90)+10;
        }
        return pcm;
    }

    //Static method that calculates total,average and percentage for each student
    public static double[][] calculateResults(int[][] pcm){
        double[][] result=new double[pcm.length][3];
        
	    for(int i=0;i<pcm.length;i++){
	        //sum of all three subjects
            int total=pcm[i][0]+pcm[i][1]+pcm[i][2];
            
	        //average marks
	        double avg=total/3.0;
	    
	        //percentage calculation
            double per=(total/300.0)*100;
            result[i][0]=total;
	    
	        //round average to 2 decimals
            result[i][1]=Math.round(avg*100.0)/100.0;
	    
	        //round percentage to 2 decimals
            result[i][2]=Math.round(per*100.0)/100.0;
        }
        return result;
    }

    //Assigns grade based on percentage as per given table
    public static char[][] calculateGrades(double[][] result){
        char[][] grade=new char[result.length][1];
        
	    for(int i=0;i<result.length;i++){
	        //percentage of student
            double p=result[i][2];
            if(p>=80) grade[i][0]='A';
            else if(p>=70) grade[i][0]='B';
            else if(p>=60) grade[i][0]='C';
            else if(p>=50) grade[i][0]='D';
            else if(p>=40) grade[i][0]='E';
            else grade[i][0]='R';
        }
        return grade;
    }

    //Static method that displays final scorecard of all students
    public static void displayScoreCard(int[][] pcm,double[][] result,char[][] grade){
        System.out.println("ID\tPhy\tChem\tMath\tTotal\tAvg\tPercent\tGrade");
        
	    for(int i=0;i<pcm.length;i++){
            System.out.println((i+1)+"\t"+pcm[i][0]+"\t"+pcm[i][1]+"\t"+pcm[i][2]+"\t"+(int)result[i][0]+"\t"+result[i][1]+"\t"+result[i][2]+"\t"+grade[i][0]);
        }
    }

    //Main method to take input number of students from the user
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
	
	    //Take input number of students from the user
        System.out.print("Enter number of students:");
        int students=input.nextInt();
        
	    int[][] pcm=generatePCMMarks(students);
        double[][] result=calculateResults(pcm);
        char[][] grade=calculateGrades(result);
        
	    displayScoreCard(pcm,result,grade);
        
	    input.close();
    }
}
