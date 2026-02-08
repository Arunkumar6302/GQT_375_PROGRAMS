package com.gqt.collection;

import java.util.Vector;

public class Program16 {
	public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("Java");
        v.add("Python");
        v.add("C++");
        System.out.println("Vector elements: " + v);
		System.out.println("Removed element: " + v.remove(1));
		System.out.println("Vector after removal: " + v);
		System.out.println("--------------------");
		System.out.println("Iterating Over Queue : ");
		
        System.out.println("Vector elements:");
        for (String s : v) {
            System.out.println(s);
        }
    }
}
