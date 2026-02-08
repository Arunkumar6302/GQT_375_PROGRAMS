package com.gqt.inheritance;
import java.util.Scanner;

class Vehicle {
    String make;
    String model;
    int year;
    void getVehicleDetails() {
    	make = "Audi";
    	model = "fir";
    	year = 2026;
    }
    void displayVehicleDetails() {
        System.out.println("Vehicle Make  : " + make);
        System.out.println("Vehicle Model : " + model);
        System.out.println("Year          : " + year);
    }
}
class Car extends Vehicle {
    String color;
    double mileage;
    void getCarDetails() {
        color = "White";
        mileage = 24.5;
    }
    void displayCarDetails() {
        displayVehicleDetails();
        System.out.println("Car Color     : " + color);
        System.out.println("Mileage       : " + mileage + " km/l");
    }
}
public class Program1_2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.getVehicleDetails();
        car.getCarDetails();
        System.out.println("--- CAR DETAILS ---");
        car.displayCarDetails();
    }
}
