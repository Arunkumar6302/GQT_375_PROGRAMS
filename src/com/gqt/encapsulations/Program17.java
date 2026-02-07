package com.gqt.encapsulations;

class Bank11 {
    private int accNo;
    private double balance;

    public void setAcc(int a) {
        accNo = a;
        System.out.println("Account Number : "+accNo);
    }

    public void deposit(double amt) {
        balance += amt;
        System.out.println("Deposite Amount : "+balance);
    }

    public void withdraw(double amt) {
        balance -= amt;
        System.out.println("With Draw Amount : "+amt);
    }

    public double getBalance() {
        return balance;
    }
}

public class Program17 {
    public static void main(String[] args) {
        Bank11 b = new Bank11();
        b.setAcc(101);
        b.deposit(5000);
        b.withdraw(2000);
        System.out.println("Balance Amount :"+b.getBalance());
    }
}

