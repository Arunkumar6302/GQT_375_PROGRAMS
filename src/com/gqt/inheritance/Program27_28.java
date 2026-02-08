package com.gqt.inheritance;

import java.util.Scanner;

class Animal3 {
    String name, type;

    void getAnimalDetails(Scanner sc) {
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Type: ");
        type = sc.nextLine();
    }

    void displayAnimalDetails() {
        System.out.println("Name : " + name);
        System.out.println("Type : " + type);
    }
}

class Bird3 extends Animal3 {
    String color;
    double wingspan;

    void getBirdDetails(Scanner sc) {
        System.out.print("Enter Color: ");
        color = sc.nextLine();
        System.out.print("Enter Wingspan: ");
        wingspan = sc.nextDouble();
    }

    void displayBirdDetails() {
        displayAnimalDetails();
        System.out.println("Color     : " + color);
        System.out.println("Wingspan  : " + wingspan);
    }
}

public class Program27_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bird3 b = new Bird3();

        b.getAnimalDetails(sc);
        b.getBirdDetails(sc);

        System.out.println("--- Bird Details ---");
        b.displayBirdDetails();
    }
}
