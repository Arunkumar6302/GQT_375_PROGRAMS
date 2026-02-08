package com.gqt.inheritance;

import java.util.Scanner;

class Animal {
    String name;
    int age;
    void getAnimalDetails(Scanner sc) {
        System.out.print("Enter Animal Name: ");
        name = sc.nextLine();
        System.out.print("Enter Age: ");
        age = sc.nextInt();
        sc.nextLine();
    }
    void displayAnimalDetails() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}
class Dog extends Animal {
    String breed;
    String color;
    void getDogDetails(Scanner sc) {
        System.out.print("Enter Dog Breed: ");
        breed = sc.nextLine();
        System.out.print("Enter Dog Color: ");
        color = sc.nextLine();
    }
    void displayDogDetails() {
        displayAnimalDetails();
        System.out.println("Breed: " + breed);
        System.out.println("Color: " + color);
    }
}
class Cat extends Animal {
    String breed;
    String color;
    void getCatDetails(Scanner sc) {
        System.out.print("Enter Cat Breed: ");
        breed = sc.nextLine();
        System.out.print("Enter Cat Color: ");
        color = sc.nextLine();
    }
    void displayCatDetails() {
        displayAnimalDetails();
        System.out.println("Breed: " + breed);
        System.out.println("Color: " + color);
    }
}
public class Program4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dog dog = new Dog();
        System.out.println("Enter Dog Details :");
        dog.getAnimalDetails(sc);
        dog.getDogDetails(sc);
        System.out.println("----------------------");
        Cat cat = new Cat();
        System.out.println(" Enter Cat Details :");
        cat.getAnimalDetails(sc);
        cat.getCatDetails(sc);
        System.out.println("----------------------");
        System.out.println("Dog Information :");
        dog.displayDogDetails();
        System.out.println("----------------------");

        System.out.println("Cat Information :");
        cat.displayCatDetails();
    }
}
