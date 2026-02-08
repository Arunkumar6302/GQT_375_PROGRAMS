package com.gqt.inheritance;

import java.util.Scanner;

class Employee {
    String name;
    int id;
    double salary;
    void getEmployeeDetails(Scanner sc) {
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter ID: ");
        id = sc.nextInt();
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
        sc.nextLine();
    }
    void displayEmployeeDetails() {
        System.out.println("Name   : " + name);
        System.out.println("ID     : " + id);
        System.out.println("Salary : " + salary);
    }
}
class Manager extends Employee {
    String department;
    String designation;
    void getManagerDetails(Scanner sc) {
        System.out.print("Enter Department: ");
        department = sc.nextLine();
        System.out.print("Enter Designation: ");
        designation = sc.nextLine();
    }
    void displayManagerDetails() {
        displayEmployeeDetails();
        System.out.println("Department  : " + department);
        System.out.println("Designation : " + designation);
    }
}
public class Program7_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager m = new Manager();
        m.getEmployeeDetails(sc);
        m.getManagerDetails(sc);      
        System.out.println("Employee DEtails : ");
        m.displayEmployeeDetails();
        System.out.println("---------------------");
        System.out.println("Manager Dtails : ");
        m.displayManagerDetails();
    }
}

