import java.util.*;

public class markscalculator {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF SUBJECTS:");
        int n= sc.nextInt();

        int marks[]= new int[n];
        for(int i=0 ; i<n ; i++){
            System.out.println("ENTER THE MARKS FOR SUBJECT " +(i+1)+ ":" );
            marks[i]= sc.nextInt();
        }
        int total=0;
        for (int mark : marks) {
            total += mark;
        }

        float avg= (float) total / n * 100;

        String grade;
        if (avg>=90){
            grade= "A";
        }
        else if (avg>=80){
            grade= "B";
        }
        else if (avg>=55){
            grade= "C";
        }
        else if (avg>=40){
            grade= "D";
        }
        else if (avg>=25){
            grade= "E";
        }
        else{
            grade= "F";
        }

        System.out.println("TOTAL MARKS OBTAINED:" +total);
        System.out.println("AVERAGE MARKS OBTAINED:" +avg);
        System.out.println("GRADE OBTAINED:" +grade);

    }

}
