package com.gqt.inheritance;

import java.util.Scanner;

class Shapee {
    String type;
    String color;

    void getShapeDetails(Scanner sc) {
        System.out.print("Enter Shape Type: ");
        type = sc.nextLine();
        System.out.print("Enter Color: ");
        color = sc.nextLine();
    }

    void displayShapeDetails() {
        System.out.println("Type  : " + type);
        System.out.println("Color : " + color);
    }
}

class Triangle extends Shapee {
    double base, height;

    void getTriangleDetails(Scanner sc) {
        System.out.print("Enter Base: ");
        base = sc.nextDouble();
        System.out.print("Enter Height: ");
        height = sc.nextDouble();
    }

    void displayTriangleDetails() {
        displayShapeDetails();
        System.out.println("Area : " + (0.5 * base * height));
    }
}

public class Program13_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle t = new Triangle();

        t.getShapeDetails(sc);
        t.getTriangleDetails(sc);

        System.out.println("\n--- Triangle Details ---");
        t.displayTriangleDetails();
    }
}

