package com.gqt.interface1;

interface Drawable3 {
    void draw();
}

interface Printable3 {
    void print();
}

class Canvas3 implements Drawable3 {

    public void draw() {
        System.out.println("Drawing on the canvas");
    }
}

class Printer3 implements Printable3 {

    public void print() {
        System.out.println("Printing the document");
    }
}

public class Program29_30 {
    public static void main(String[] args) {
        Canvas3 c = new Canvas3();
        Printer3 p = new Printer3();

        c.draw();
        p.print();
    }
}

