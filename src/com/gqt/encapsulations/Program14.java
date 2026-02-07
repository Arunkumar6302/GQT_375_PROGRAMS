package com.gqt.encapsulations;

class Employee1 {
    private String name;

    public void setName(String name) {
        this.name = name;
        System.out.println("Enter Employee Name :"+name);
    }

    public String getName() {
        return name;
    }
}

public class Program14 {
    public static void main(String[] args) {
        Employee1 e = new Employee1();
        e.setName("Arun");
        System.out.println("Displaying Employee Name : "+e.getName());
    }
}

