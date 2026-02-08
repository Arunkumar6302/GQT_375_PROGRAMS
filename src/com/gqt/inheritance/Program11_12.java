package com.gqt.inheritance;

import java.util.Scanner;

class BankAccount {
    int accNo;
    double balance;

    void getAccountDetails(Scanner sc) {
        System.out.print("Enter Account Number: ");
        accNo = sc.nextInt();
        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
    }

    void displayAccountDetails() {
        System.out.println("Account No : " + accNo);
        System.out.println("Balance    : " + balance);
    }
}

class SavingsAccount extends BankAccount {
    void displaySavings() {
        displayAccountDetails();
    }
}

class CurrentAccount extends BankAccount {
    void displayCurrent() {
        displayAccountDetails();
    }
}

public class Program11_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SavingsAccount s = new SavingsAccount();
        s.getAccountDetails(sc);

        CurrentAccount c = new CurrentAccount();
        c.getAccountDetails(sc);

        System.out.println("--- Savings Account ---");
        s.displaySavings();

        System.out.println("--- Current Account ---");
        c.displayCurrent();
    }
}
