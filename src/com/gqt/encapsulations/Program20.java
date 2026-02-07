package com.gqt.encapsulations;

class Computer1 {
    private int price;

    public void setPrice(int price) {
        this.price = price;
        System.out.println("Setting Computer price : "+price);
    }

    public int getPrice() {
        return price;
    }
}

public class Program20 {
    public static void main(String[] args) {
    	Computer1 m = new Computer1();
        m.setPrice(15000);
        System.out.println("Getting Computer Price : "+m.getPrice());
    }
}

