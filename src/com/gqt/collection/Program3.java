package com.gqt.collection;

import java.util.HashSet;

public class Program3 {
	public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        System.out.println("Adding elements to HashSet");
        set.add(10);
        set.add(20);
        set.add(10); 
        set.add(30);
        System.out.println("Hash Set Elements : "+set);
        System.out.println("Removing Element 30 from the Set : ");
        set.remove(30);
        System.out.println("HashSet elements After Removing :");
        for (int i : set) {
            System.out.println(i);
        }
    }
}
