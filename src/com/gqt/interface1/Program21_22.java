package com.gqt.interface1;

interface Drawable1 {
    void draw();
}

interface Erasable {
    void erase();
}

class Whiteboard implements Drawable1 {
    public void draw() {
        System.out.println("Drawing on whiteboard");
    }
}

class Chalkboard implements Erasable {
    public void erase() {
        System.out.println("Erasing chalkboard");
    }
}

public class Program21_22 {
    public static void main(String[] args) {
        Whiteboard w = new Whiteboard();
        Chalkboard c = new Chalkboard();

        w.draw();
        c.erase();
    }
}

