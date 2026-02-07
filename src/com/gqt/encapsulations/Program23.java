package com.gqt.encapsulations;

class Rectangle {
    private double length;
    private double width;

    public void setLength(double length) {
        this.length = length;
        System.out.println("Enter Length :"+length);
    }

    public void setWidth(double width) {
        this.width = width;
        System.out.println("Enter Width :"+width);
    }

    public double getArea() {
        return length * width;
    }
}

public class Program23 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(10);
        r.setWidth(5);

        System.out.println("Area: " + r.getArea());
    }
}

