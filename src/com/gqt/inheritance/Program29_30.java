package com.gqt.inheritance;

import java.util.Scanner;

class Shape4 {
    String type;
    String color;
}

class Circle4 extends Shape4 {
    double radius;

    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

public class Program29_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle4 c = new Circle4();

        System.out.print("Enter Shape Type: ");
        c.type = sc.nextLine();

        System.out.print("Enter Color: ");
        c.color = sc.nextLine();

        System.out.print("Enter Radius: ");
        c.radius = sc.nextDouble();

        System.out.println("--- Circle Details ---");
        System.out.println("Type  : " + c.type);
        System.out.println("Color : " + c.color);
        c.calculateArea();
    }
}

