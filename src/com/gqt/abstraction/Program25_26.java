package com.gqt.abstraction;

abstract class Bankk {
    abstract void openAccount();
    abstract void closeAccount();
}
class SavingsBankk extends Bankk {
    void openAccount() {
        System.out.println("Savings Account Opened");
    }
    void closeAccount() {
        System.out.println("Savings Account Closed");
    }
}
class CurrentBankk extends Bankk {
    void openAccount() {
        System.out.println("Current Account Opened");
    }
    void closeAccount() {
        System.out.println("Current Account Closed");
    }
}
public class Program25_26 {
    public static void main(String[] args) {
        System.out.println("Savings Bank Details ");
    	SavingsBankk b = new SavingsBankk();
        b.openAccount();
        b.closeAccount();
        System.out.println("-----------------------------");
        System.out.println("Current Bank Details : ");
        CurrentBankk cb = new CurrentBankk();
        cb.openAccount();
        cb.closeAccount();
    }
}

