package com.gqt.encapsulations;

class Mobile1 {
    private int price;

    public void setPrice(int price) {
        this.price = price;
        System.out.println("Setting Mobile price : "+price);
    }

    public int getPrice() {
        return price;
    }
}

public class Program16 {
    public static void main(String[] args) {
        Mobile1 m = new Mobile1();
        m.setPrice(15000);
        System.out.println("Getting Mobile Price : "+m.getPrice());
    }
}

