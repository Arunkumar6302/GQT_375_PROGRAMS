package com.gqt.encapsulations;

class Bank1{
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
        System.out.println("Set Balanace "+balance);
    }

    public double getBalance() {
        return balance;
        
    }
}

public class Program4 {
    public static void main(String[] args) {
        Bank1 b = new Bank1();
        b.setBalance(3000);
        System.out.println("Available Balance : "+b.getBalance());
    }
}
