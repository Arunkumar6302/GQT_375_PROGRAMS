package com.gqt.inheritance;

import java.util.Scanner;

class Person2 {
    String name;
    int age;
    void getPersonDetails(Scanner sc) {
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Age: ");
        age = sc.nextInt();
        sc.nextLine();
    }
    void displayPersonDetails() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}
class Employee2 extends Person2 {
    int id;
    double salary;
    void getEmployeeDetails(Scanner sc) {
        System.out.print("Enter ID: ");
        id = sc.nextInt();
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }
    void displayEmployeeDetails() {
        displayPersonDetails();
        System.out.println("ID     : " + id);
        System.out.println("Salary : " + salary);
    }
}
public class Program21_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee2 e = new Employee2();
        e.getPersonDetails(sc);
        e.getEmployeeDetails(sc);

        System.out.println("--- Employee Details ---");
        e.displayEmployeeDetails();
    }
}

