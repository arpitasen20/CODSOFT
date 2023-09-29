import java.util.Scanner;
import java.text.DecimalFormat;


public class CurrencyConverter
{
    public static void main(String[]args){
        System.out.println("------------------------------------");
        System.out.println("|    Currency Converter Project.   |");
        System.out.println("------------------------------------");

        double ruppee,dollar,euro,pound;
        DecimalFormat f= new DecimalFormat("##.##");
        System.out.println("Choose Base Currency: \n 1.Ruppee \n 2.Dollar \n 3.Euro \n 4.Pound");
        Scanner sc= new Scanner(System.in);
        int base=sc.nextInt();
        System.out.println("Choose Target Currency:  \n 1.Ruppee \n 2.Dollar \n 3.Euro \n 4.Pound");
        int target= sc.nextInt();
        
        if(base==1 && target==1){
            System.out.println("Enter Amount in Ruppees:");
            ruppee= sc.nextDouble();
            System.out.println("Ruppees: Rs "+ruppee);
         }
        
        
        if(base == 1 && target==2){
            System.out.println("Enter Amount in Ruppees: ");
            ruppee= sc.nextDouble();
            dollar= ruppee/82.6;
            System.out.println("Dollar: $ "+f.format(dollar));
            }
        
       else if(base==1 && target==3){
            System.out.println("Enter Amount in Ruppees: ");
            ruppee= sc.nextDouble();
            euro=ruppee/89.2;
             System.out.println("Euro: € "+f.format(euro));
           }
           
          else if(base==1 && target==4){
                System.out.println("Enter Amount in Ruppees: ");
            ruppee= sc.nextDouble();
            pound=ruppee/103.9;
            System.out.println("Pound: £ "+f.format(pound));
           }
           
          else if(base==2 && target==1){
               System.out.println("Enter Amount in Dollars: ");
               dollar=sc.nextDouble();
               ruppee= dollar*82.6;
               System.out.println("Ruppees: Rs "+f.format(ruppee));
           }
           
          else if(base==2 && target==2 ){
                System.out.println("Enter Amount in Dollars: ");
               dollar=sc.nextDouble();
             System.out.println("Dollar: $ "+f.format(dollar));
           }
           
           else if(base==2 && target==3 ){
             System.out.println("Enter Amount in Dollars: ");
               dollar=sc.nextDouble();
               euro= dollar*0.92;
               System.out.println("Euro: € "+f.format(euro));
           }
           
           else if(base==2 && target==4){
             System.out.println("Enter Amount in Dollars: ");
               dollar=sc.nextDouble();
               pound= dollar*0.79;
               System.out.println("Pound: £ "+f.format(pound)); 
           }
           
           
           else if(base==3 && target==1){
             System.out.println("Enter Amount in Euro: ");
               euro=sc.nextDouble();
               ruppee= euro*89.2;
               System.out.println("Ruppees: Rs "+f.format(ruppee));
           }
           
           
           else if(base==3 && target==2){
                System.out.println("Enter Amount in Euro: ");
               euro=sc.nextDouble();
              dollar=euro*1.08;
               System.out.println("Dollar: $ "+f.format(dollar));
           }
           
           
           else if(base==3 && target==3){
                System.out.println("Enter Amount in Euro: ");
               euro=sc.nextDouble();
               System.out.println("Euro: € "+f.format(euro));
           }
        
           else if(base==3 && target==4){
                System.out.println("Enter Amount in Euro: ");
               euro=sc.nextDouble();
             pound=euro*0.85;
               System.out.println("Pound: £ "+f.format(pound));
           }
           else if(base==4 && target==1){
                System.out.println("Enter Amount in Pound: ");
               pound=sc.nextDouble();
               ruppee= pound*103.9;
               System.out.println("Ruppees: Rs "+f.format(ruppee));
           }
           else if(base==4 && target==2){
                System.out.println("Enter Amount in Pound: ");
               pound=sc.nextDouble();
              dollar=pound*1.25;
               System.out.println("Dollar: $ "+f.format(dollar));
           }
           else if(base==4 && target==3){
                System.out.println("Enter Amount in Pound: ");
               pound=sc.nextDouble();
             euro=pound*1.16;
               System.out.println("Euro: € "+f.format(euro));
           }
          else if(base==4 && target==4){
                System.out.println("Enter Amount in Pound: ");
               pound=sc.nextDouble();
                System.out.println("Pound: £ "+f.format(pound));
               
           }
           else{
               System.out.println("Invalid Choice!");
           }
           
    }
    
}