package com.gqt.abstraction;

abstract class Bank {
    abstract void openAccount();
    abstract void closeAccount();
}
class SavingsBank extends Bank {
    void openAccount() {
        System.out.println("Savings Account Opened");
    }
    void closeAccount() {
        System.out.println("Savings Account Closed");
    }
}
class CurrentBank extends Bank {
    void openAccount() {
        System.out.println("Current Account Opened");
    }

    void closeAccount() {
        System.out.println("Current Account Closed");
    }
}
public class Program13 {
    public static void main(String[] args) {
        System.out.println("Savings Bank Details ");
    	SavingsBank b = new SavingsBank();
        b.openAccount();
        b.closeAccount();
        System.out.println("-----------------------------");
        System.out.println("Current Bank Details : ");
        CurrentBank cb = new CurrentBank();
        cb.openAccount();
        cb.closeAccount();
    }
}

