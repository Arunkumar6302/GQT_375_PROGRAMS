package com.gqt.inheritance;

import java.util.Scanner;

class Person {
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
class Student extends Person {
    int rollNo;
    void getStudentDetails(Scanner sc) {
        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
        sc.nextLine();
    }
    void displayStudentDetails() {
        displayPersonDetails();
        System.out.println("Roll No : " + rollNo);
    }
}
class Teacher extends Person {
    String subject;

    void getTeacherDetails(Scanner sc) {
        System.out.print("Enter Subject: ");
        subject = sc.nextLine();
    }

    void displayTeacherDetails() {
        displayPersonDetails();
        System.out.println("Subject : " + subject);
    }
}

public class Program9_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();
        s.getPersonDetails(sc);
        s.getStudentDetails(sc);

        Teacher t = new Teacher();
        t.getPersonDetails(sc);
        t.getTeacherDetails(sc);

        System.out.println("--- Student Details ---");
        s.displayStudentDetails();
        System.out.println("------------------------------");

        System.out.println("--- Teacher Details ---");
        t.displayTeacherDetails();
    }
}
