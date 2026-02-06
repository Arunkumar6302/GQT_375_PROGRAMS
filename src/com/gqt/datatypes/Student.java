package com.gqt.datatypes;

public class Student {
	int id;
    Student(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        Student[] s = new Student[2];
        s[0] = new Student(1);
        s[1] = new Student(2);

        System.out.println(s[0].id);
        System.out.println(s[1].id);
    }
}
