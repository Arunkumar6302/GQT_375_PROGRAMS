package com.gqt.inheritance;

import java.util.Scanner;

class Vehiclee {
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

class Truck extends Vehiclee {
    double capacity, mileage;

    void getTruckDetails(Scanner sc) {
        System.out.print("Enter Capacity: ");
        capacity = sc.nextDouble();
        System.out.print("Enter Mileage: ");
        mileage = sc.nextDouble();
    }

    void displayTruckDetails() {
        displayVehicleDetails();
        System.out.println("Capacity : " + capacity);
        System.out.println("Mileage  : " + mileage);
    }
}

public class Program15_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Truck t = new Truck();

        t.getVehicleDetails(sc);
        t.getTruckDetails(sc);

        System.out.println("\n--- Truck Details ---");
        t.displayTruckDetails();
    }
}
