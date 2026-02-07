package com.gqt.encapsulations;

class Car1 {
    private int price;

    public void setPrice(int price) {
        this.price = price;
        System.out.println("Enter Price : "+price);
    }

    public int getPrice() {
        return price;
    }
}

public class Program6 {
    public static void main(String[] args) {
        Car1 c = new Car1();
        c.setPrice(800000);
        System.out.println("Getting price of Car : "+c.getPrice());
    }
}
