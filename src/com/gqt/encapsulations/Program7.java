package com.gqt.encapsulations;

class Book {
    private String title;
    private String author;
    private int price;

    public void setBook(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("Book Title :"+title);
        System.out.println("Book Author : "+author);
        System.out.println("Book Price : "+price);
        
    }
}

public class Program7 {
    public static void main(String[] args) {
        Book b = new Book();
        b.setBook("Java", "James", 500);
        b.display();
    }
}
