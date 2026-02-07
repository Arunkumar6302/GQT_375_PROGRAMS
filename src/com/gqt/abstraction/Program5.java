package com.gqt.abstraction;

abstract class Employee {
    abstract void calculateSalary();
    abstract void calculateBonus();
}

class Manager extends Employee {
    void calculateSalary() {
        System.out.println("Manager Salary: 50000");
    }

    void calculateBonus() {
        System.out.println("Manager Bonus: 10000");
    }
}

class Clerk extends Employee {
    void calculateSalary() {
        System.out.println("Clerk Salary: 25000");
    }

    void calculateBonus() {
        System.out.println("Clerk Bonus: 3000");
    }
}

public class Program5 {
    public static void main(String[] args) {
        Manager m = new Manager();
        System.out.println("Manager Details : ");
        m.calculateSalary();
        m.calculateBonus();
        System.out.println("_________________________");
        System.out.println("Clerk Details");
        Clerk c = new Clerk();
        c.calculateSalary();
        c.calculateBonus();
    }
}

