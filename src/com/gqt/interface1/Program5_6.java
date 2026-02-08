package com.gqt.interface1;

interface MyComparable {
    int compareTo(int x);
}

interface MyCloneable {
    Object clone();
}

class NumberClass implements MyComparable, MyCloneable {
    int num;
    NumberClass(int num) {
        this.num = num;
    }
    public int compareTo(int x) {
        return num - x;
    }
    public Object clone() {
        return new NumberClass(num);
    }
}
class Person implements MyCloneable {
    String name;
    Person(String name) {
        this.name = name;
    }
    public Object clone() {
        return new Person(name);
    }
}
public class Program5_6 {
    public static void main(String[] args) {
        NumberClass n = new NumberClass(10);
        System.out.println("Compare result: " + n.compareTo(5));

        Person p = new Person("Arun");
        Person p2 = (Person) p.clone();
        System.out.println("Cloned Person: " + p2.name);
    }
}

