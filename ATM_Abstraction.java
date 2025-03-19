package practice;

import java.util.Scanner;

abstract class ATM { // Parent class
    double balance;

    ATM(double balance) { // Parent constructor
        this.balance = balance;
    }

    abstract void withDraw(double amount);
    abstract void deposit(double amount);
    abstract void checkBal();
}

class SBI extends ATM {
    SBI(double balance) {
        super(balance);
    }

    // Withdraw method
    void withDraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Success, Available balance: " + balance);
        } else {
            System.out.println("Insufficient Balance.");
        }
    }

    // Deposit method
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successful, Updated balance: " + balance);
        } else {
            System.out.println("Invalid Deposit Amount.");
        }
    }

    // Check Balance
    void checkBal() {
        System.out.println("Current Balance: " + balance);
    }
}

public class ATM_Abstraction {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SBI obj = new SBI(1000);

        while (true) {
            System.out.println("------------------- ATM MENU ---------------------");
            System.out.println("1. Withdraw Money ");
            System.out.println("2. Deposit Money ");
            System.out.println("3. Check Balance ");
            System.out.println("4. Exit");
            System.out.println("-------------------------------------------------");

            System.out.print("Enter your choice: ");
            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double with_amt = s.nextDouble();
                    obj.withDraw(with_amt);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depo_amt = s.nextDouble();
                    obj.deposit(depo_amt);
                    break;
                case 3:
                    obj.checkBal();
                    break;
                case 4:
                    System.out.println("Thank you for using SBI ATM.");
                    s.close();
                    System.exit(0); // Exit the program
                default:
                    System.out.println("Enter a valid choice.");
            }
        }
    }
}