package com.gqt.interface1;

interface RunnableAnimal {
    void run();
}

interface Walkable {
    void walk();
}

class Cheetah implements RunnableAnimal {
    public void run() {
        System.out.println("Cheetah runs fast");
    }
}

class Tortoise implements Walkable {
    public void walk() {
        System.out.println("Tortoise walks slowly");
    }
}

public class Program17_18 {
    public static void main(String[] args) {
        Cheetah c = new Cheetah();
        Tortoise t = new Tortoise();

        c.run();
        t.walk();
    }
}
