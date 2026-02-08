package com.gqt.interface1;

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Bird implements Flyable {

    public void fly() {
        System.out.println("Bird is flying in the sky");
    }
}

class Fish implements Swimmable {

    public void swim() {
        System.out.println("Fish is swimming in water");
    }
}

public class Program3_4 {
    public static void main(String[] args) {
        Bird b = new Bird();
        Fish f = new Fish();

        b.fly();
        f.swim();
    }
}

