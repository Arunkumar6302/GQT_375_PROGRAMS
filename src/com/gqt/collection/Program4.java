package com.gqt.collection;

import java.util.TreeSet;

public class Program4 {
	public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        System.out.println("Adding elements to TreeSet");
        set.add(10);
        set.add(20);
        set.add(10); 
        set.add(30);
        System.out.println("Tree Set Elements : "+set);
        System.out.println("Removing Element 30 from the Set : ");
        set.remove(30);
        System.out.println("TreeSet elements After Removing (Sorting Order ):");
        for (int i : set) {
            System.out.println(i);
        }
    }
}
