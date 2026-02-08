package com.gqt.abstraction;

abstract class Figure {
    abstract void draw();
    abstract void erase();
}

class Rectangle3 extends Figure {
    void draw() {
        System.out.println("Rectangle Drawn");
    }

    void erase() {
        System.out.println("Rectangle Erased");
    }
}

class Circle3 extends Figure {
    void draw() {
        System.out.println("Circle Drawn");
    }

    void erase() {
        System.out.println("Circle Erased");
    }
}

public class Program15_16 {
    public static void main(String[] args) {
        System.out.println("Recatngle Details :  ");
        Rectangle3 r = new Rectangle3();
        r.draw();
        r.erase();
        System.out.println("----------------------------");
        System.out.println("Circle Details : ");
        Circle3 c = new Circle3();
        c.draw();
        c.erase();
    }
}

