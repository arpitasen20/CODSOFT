/***********code_by____arpita sen*************/


import java.util.Scanner;

public class atm {
    private String accountHolder;
    private int accountNumber;
    private static double balance;
    public atm(String accountHolder, int accountNumber, double initialBalance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    public void display(){
        System.out.println("Account Holder :" + this.accountHolder);
        System.out.println("Account Number :" + this.accountNumber);
        System.out.println("Initial Balance :" + this.balance);
    }
    public static double getBalance() {
        return balance;
    }
    
    public static void deposit(double amount) {
        balance += amount;
    }
    
    public static boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name :");
        String accountHolder = sc.nextLine();
        System.out.println("Enter account number :");
        int accountNumber = sc.nextInt();
        System.out.println("Enter Initial Balance :");
        double initialBalance = sc.nextDouble();
        System.out.println();
        System.out.println("Displaying Account Details :");
        new atm(accountHolder, accountNumber, initialBalance).display();
        System.out.println();
        
        while (true) {
            System.out.println("ATM Interface");
            System.out.println();
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println();
            System.out.print("Select an option: ");
            
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Current Balance: " + atm.getBalance()+"/-");
                    break;
                    
                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    atm.deposit(depositAmount);
                    System.out.println("Deposit successful. Current Balance: " + atm.getBalance()+"/-");
                    break;
                    
                case 3:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    boolean success = atm.withdraw(withdrawAmount);
                    if (success) {
                        System.out.println("Withdrawal successful. Current Balance: " + atm.getBalance()+"/-");
                    } else {
                        System.out.println("Insufficient funds. Current Balance: " + atm.getBalance()+"/-");
                    }
                    break;
                    
                case 4:
                    System.out.println("Exiting ATM. Thank you!");
                    sc.close();
                    System.exit(0);
                    
                default:
                    System.out.println("Invalid option. Please select a valid option.");
                    break;
            }
        }
    }
}
/***********code_by____arpita sen*************/

