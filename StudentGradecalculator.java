
import java.util. Scanner;
public class StudentGradecalculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hii! Firstly,Enter the Number of Subjects:");
        int nSubjects = sc.nextInt();
        int [] marks = new int[nSubjects];
        int totalmarks = 0;

        for(int i = 0; i < nSubjects ; i++){
            System.out.println("Enter the marks scored in individual subject" + (i+1) + " : " );
            marks[i] = sc.nextInt();
            totalmarks += marks[i];

        }
        double averagePercentage = (double) totalmarks / (nSubjects*100) *100;
        System.out.println("Heyy! Your Academic Result is here:");
        System.out.println("Total Marks Scored:" + totalmarks);
        System.out.println("Average Percentage:" + averagePercentage + "%");
        
        String grade = calculateGrade(averagePercentage);
        System.out.println("Grade Scored:" + grade);

        sc.close();


    }
    public static String calculateGrade(double percentage){
        if(percentage>=90){
            return "Congratulations! You scored A++ Grade";
        }
        else if(percentage>=80 && percentage<90){
            return " Good!You scored A grade";
        }
        else if(percentage>=70 && percentage<80){
            return "You scored B++ grade";
        }
        else if(percentage>=60 && percentage<70){
            return " You scored B grade"; 
        }
        else if (percentage>=45 && percentage<60){
            return " Need Improvement ! You scored C grade";

        }
        else{
            return "Fail! you scored D grade";
        }
    
    }
}