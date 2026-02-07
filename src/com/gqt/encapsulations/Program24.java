package com.gqt.encapsulations;


class Rectangle1 {
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

public class Program24 {
    public static void main(String[] args) {
        Rectangle1 r = new Rectangle1();
        r.setLength(10);
        r.setWidth(5);

        System.out.println("Area: " + r.getArea());
    }
}

