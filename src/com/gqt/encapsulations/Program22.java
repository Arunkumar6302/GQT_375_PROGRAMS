package com.gqt.encapsulations;

class LibraryBook1 {
    private String title;

    public void setTitle(String title) {
       this. title = title;
       System.out.println("Setting LibraryBook title: "+title);
    }

    public String getTitle() {
        return title;
    }
}

public class Program22 {
    public static void main(String[] args) {
    	LibraryBook1 b = new LibraryBook1();
        b.setTitle("DSA");
        System.out.println("LibraryBook title : "+b.getTitle());
    }
}
