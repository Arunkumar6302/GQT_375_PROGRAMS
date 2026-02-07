package com.gqt.encapsulations;

class Student2 {
    private String name;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}

public class Program10 {
    public static void main(String[] args) {
        Student2 s = new Student2();
        s.setName("Arun");
        System.out.println("Name of the Student :"+s.getName());
    }
}
