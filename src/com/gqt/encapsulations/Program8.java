package com.gqt.encapsulations;

class Book1 {
    private String title;

    public void setTitle(String title) {
       this. title = title;
    }

    public String getTitle() {
        return title;
    }
}

public class Program8 {
    public static void main(String[] args) {
        Book1 b = new Book1();
        b.setTitle("DSA");
        System.out.println("Book title : "+b.getTitle());
    }
}
