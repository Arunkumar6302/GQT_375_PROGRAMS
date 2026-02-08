package com.gqt.inheritance;

import java.util.Scanner;

class Fruit {
    String name, color;

    void getFruitDetails(Scanner sc) {
        System.out.print("Enter Fruit Name: ");
        name = sc.nextLine();
        System.out.print("Enter Color: ");
        color = sc.nextLine();
    }

    void displayFruitDetails() {
        System.out.println("Name  : " + name);
        System.out.println("Color : " + color);
    }
}

class Apple extends Fruit {
    String taste, size;

    void getAppleDetails(Scanner sc) {
        System.out.print("Enter Taste: ");
        taste = sc.nextLine();
        System.out.print("Enter Size: ");
        size = sc.nextLine();
    }

    void displayAppleDetails() {
        displayFruitDetails();
        System.out.println("Taste : " + taste);
        System.out.println("Size  : " + size);
    }
}

class Banana extends Fruit {
    String taste, size;

    void getBananaDetails(Scanner sc) {
        System.out.print("Enter Taste: ");
        taste = sc.nextLine();
        System.out.print("Enter Size: ");
        size = sc.nextLine();
    }

    void displayBananaDetails() {
        displayFruitDetails();
        System.out.println("Taste : " + taste);
        System.out.println("Size  : " + size);
    }
}

public class Program17_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Apple a = new Apple();
        a.getFruitDetails(sc);
        a.getAppleDetails(sc);

        Banana b = new Banana();
        b.getFruitDetails(sc);
        b.getBananaDetails(sc);

        System.out.println("--- Apple Details ---");
        a.displayAppleDetails();

        System.out.println("--- Banana Details ---");
        b.displayBananaDetails();
    }
}

