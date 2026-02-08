package com.gqt.abstraction;

abstract class Vehicle {
    abstract void start();
    abstract void stop();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car started");
    }

    void stop() {
        System.out.println("Car stopped");
    }
}

class Motorcycle extends Vehicle {
    void start() {
        System.out.println("Motorcycle started");
    }

    void stop() {
        System.out.println("Motorcycle stopped");
    }
}

public class Program9_10 {
    public static void main(String[] args) {
    	System.out.println("Car Details : ");
        Car c = new Car();
        c.start();
        c.stop();
        System.out.println("-------------------");
        System.out.println("Motorcycle Details : ");
        Motorcycle m = new Motorcycle();
        m.start();
        m.stop();
    }
}

