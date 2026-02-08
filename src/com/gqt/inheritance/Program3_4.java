package com.gqt.inheritance;

import java.util.Scanner;

class Shape {
    void area() {
        System.out.println("Area method from Shape class");
    }
    void perimeter() {
        System.out.println("Perimeter method from Shape class");
    }
}
class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    void area() {
        System.out.println("Circle Area: " + (Math.PI * radius * radius));
    }
    void perimeter() {
        System.out.println("Circle Perimeter: " + (2 * Math.PI * radius));
    }
}
class Rectangle extends Shape {
    double length, breadth;
    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }
    void area() {
        System.out.println("Rectangle Area: " + (length * breadth));
    }

    void perimeter() {
        System.out.println("Rectangle Perimeter: " + (2 * (length + breadth)));
    }
}
public class Program3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        System.out.print("Enter length of rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double b = sc.nextDouble();
        Circle s1 = new Circle(r);
        Rectangle s2 = new Rectangle(l, b);
        System.out.println("Circle Details :");
        s1.area();
        s1.perimeter();
        System.out.println("----------------------------");
        System.out.println("Rectangle Details : ");
        s2.area();
        s2.perimeter();
    }
}

