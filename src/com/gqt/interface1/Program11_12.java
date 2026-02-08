package com.gqt.interface1;

interface Sortable {
    void sort();
}

interface Searchable {
    void search();
}

class MyListClass implements Sortable {
    public void sort() {
        System.out.println("Sorting list");
    }
}

class Dictionary implements Searchable {
    public void search() {
        System.out.println("Searching dictionary");
    }
}

public class Program11_12 {
    public static void main(String[] args) {
        MyListClass l = new MyListClass();
        Dictionary d = new Dictionary();

        l.sort();
        d.search();
    }
}

