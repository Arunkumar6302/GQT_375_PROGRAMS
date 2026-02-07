package com.gqt.encapsulations;

class Circle {
    private double r;

    public void setRadius(double r) {
        this.r = r;
        System.out.println("Enter Radius :"+r);
    }

    public double area() {
        return 3.14 * r * r;
    }

    public double circumference() {
        return 2 * 3.14 * r;
    }
}

public class Program11 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(7);
        System.out.println("Area Of Circle :"+c.area());
        System.out.println("circumference of circle :"+c.circumference());
    }
}
