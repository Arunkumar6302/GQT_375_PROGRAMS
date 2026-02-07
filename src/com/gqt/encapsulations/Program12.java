package com.gqt.encapsulations;

class Circle1 {
    private double r;

    public void setR(double r) {
        this.r = r;
        System.out.println("Setting Radius :"+r);
    }

    public double getR() {
        return r;
    }
}

public class Program12 {
    public static void main(String[] args) {
        Circle1 c = new Circle1();
        c.setR(5);
        System.out.println("Getting Radius :"+c.getR());
    }
}

