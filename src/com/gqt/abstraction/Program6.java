package com.gqt.abstraction;

abstract class Employee1 {
    abstract void calculateSalary();
    abstract void calculateBonus();
}

class Manager1 extends Employee1 {
    void calculateSalary() {
        System.out.println("Manager Salary: 50000");
    }

    void calculateBonus() {
        System.out.println("Manager Bonus: 10000");
    }
}

class Clerk1 extends Employee1 {
    void calculateSalary() {
        System.out.println("Clerk Salary: 25000");
    }

    void calculateBonus() {
        System.out.println("Clerk Bonus: 3000");
    }
}

public class Program6 {
    public static void main(String[] args) {
        Manager1 m = new Manager1();
        System.out.println("Manager Details : ");
        m.calculateSalary();
        m.calculateBonus();
        System.out.println("_________________________");
        System.out.println("Clerk Details");
        Clerk1 c = new Clerk1();
        c.calculateSalary();
        c.calculateBonus();
    }
}

