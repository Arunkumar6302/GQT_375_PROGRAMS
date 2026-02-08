package com.gqt.collection;

import java.util.Hashtable;

public class Program14 {
	public static void main(String[] args) {
        Hashtable<Integer, String> map = new Hashtable<>();

        System.out.println("Adding key-value pairs");
		map.put(101, "One");
		map.put(102, "Two");
		map.put(103, "Three");
		System.out.println("LinkedHashMap Elements :");
		System.out.println(map);
		System.out.println("Value for key 1: " + map.get(101));
		System.out.println("---------------");
		for (Integer i : map.keySet()) {
			System.out.println(i+" -> "+map.get(i));
		}
    }
}
