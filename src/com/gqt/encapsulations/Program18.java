package com.gqt.encapsulations;

class Bank2{
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
        System.out.println("Set Balanace "+balance);
    }

    public double getBalance() {
        return balance;
        
    }
}

public class Program18 {
    public static void main(String[] args) {
        Bank2 b = new Bank2();
        b.setBalance(3000);
        System.out.println("Available Balance : "+b.getBalance());
    }
}
