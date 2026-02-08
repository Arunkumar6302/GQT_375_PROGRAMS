package com.gqt.inheritance;

import java.util.Scanner;

class Vehicle3 {
    String make, model;
    int year;

    void getVehicleDetails(Scanner sc) {
        System.out.print("Enter Make: ");
        make = sc.nextLine();
        System.out.print("Enter Model: ");
        model = sc.nextLine();
        System.out.print("Enter Year: ");
        year = sc.nextInt();
        sc.nextLine();
    }

    void displayVehicleDetails() {
        System.out.println("Make  : " + make);
        System.out.println("Model : " + model);
        System.out.println("Year  : " + year);
    }
}

class Car3 extends Vehicle3{
    String color;
    double mileage;

    void getCarDetails(Scanner sc) {
        System.out.print("Enter Color: ");
        color = sc.nextLine();
        System.out.print("Enter Mileage: ");
        mileage = sc.nextDouble();
    }

    void displayCarDetails() {
        displayVehicleDetails();
        System.out.println("Color   : " + color);
        System.out.println("Mileage : " + mileage);
    }
}

public class Program25_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car3 c = new Car3();

        c.getVehicleDetails(sc);
        c.getCarDetails(sc);

        System.out.println("--- Car Details ---");
        c.displayCarDetails();
    }
}
