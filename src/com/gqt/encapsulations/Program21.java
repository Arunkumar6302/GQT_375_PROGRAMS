package com.gqt.encapsulations;

class LibraryBook {
    private String title;
    private String author;
    private int price;

    public void setBook(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("LibraryBook Title :"+title);
        System.out.println("LibraryBook Author : "+author);
        System.out.println("LibraryBook Price : "+price);
        
    }
}

public class Program21 {
    public static void main(String[] args) {
    	LibraryBook b = new LibraryBook();
        b.setBook("Java", "James", 500);
        b.display();
    }
}
