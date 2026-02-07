package com.gqt.encapsulations;

class Bank21{
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
        System.out.println("Set Balanace "+balance);
    }

    public double getBalance() {
        return balance;
        
    }
}

public class Program26 {
    public static void main(String[] args) {
        Bank21 b = new Bank21();
        b.setBalance(3000);
        System.out.println("Available Balance : "+b.getBalance());
    }
}
