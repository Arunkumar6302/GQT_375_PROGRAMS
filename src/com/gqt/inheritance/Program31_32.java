package com.gqt.inheritance;

import java.util.Scanner;
class Employee4 {
    String name;
    int id;
    double salary;
}
class Manager4 extends Employee4{
    String department;
    String designation;
}
public class Program31_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager4 m = new Manager4();
        System.out.print("Enter Employee Name: ");
        m.name = sc.nextLine();
        System.out.print("Enter ID: ");
        m.id = sc.nextInt();
        System.out.print("Enter Salary: ");
        m.salary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Department: ");
        m.department = sc.nextLine();
        System.out.print("Enter Designation: ");
        m.designation = sc.nextLine();
        System.out.println("--- Manager Details ---");
        System.out.println("Name        : " + m.name);
        System.out.println("ID          : " + m.id);
        System.out.println("Salary      : " + m.salary);
        System.out.println("Department  : " + m.department);
        System.out.println("Designation : " + m.designation);
    }
}

