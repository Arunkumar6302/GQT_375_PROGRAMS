package com.gqt.interface1;

interface Drawable {
    void draw();
}

interface Resizable {
    void resize();
}
class Shape implements Drawable, Resizable {

    public void draw() {
        System.out.println("Drawing the shape");
    }

    public void resize() {
        System.out.println("Resizing the shape");
    }
}
public class Program1_2 {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.draw();
        s.resize();
    }
}

