package com.gqt.inheritance;

import java.util.Scanner;

class Shape2 {
    String type, color;

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

class Rectangle2 extends Shape2 {
    double length, width;

    void getRectangleDetails(Scanner sc) {
        System.out.print("Enter Length: ");
        length = sc.nextDouble();
        System.out.print("Enter Width: ");
        width = sc.nextDouble();
    }

    void displayRectangleDetails() {
        displayShapeDetails();
        System.out.println("Area : " + (length * width));
    }
}

public class Program23_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle2 r = new Rectangle2();

        r.getShapeDetails(sc);
        r.getRectangleDetails(sc);

        System.out.println("--- Rectangle Details ---");
        r.displayRectangleDetails();
    }
}

