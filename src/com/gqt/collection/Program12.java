package com.gqt.collection;

import java.util.Enumeration;
import java.util.Vector;

public class Program12 {
	public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(1);
        v.add(2);
        v.add(3);
        Enumeration<Integer> e = v.elements();
        System.out.println("Using Enumeration:");
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
