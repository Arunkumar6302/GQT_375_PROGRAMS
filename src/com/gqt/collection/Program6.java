package com.gqt.collection;

import java.util.TreeMap;

public class Program6 {
	public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        System.out.println("Adding key-value pairs");
        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");
        
        System.out.println("TreeMap sorted by keys:");
        System.out.println(map);
        System.out.println("Value for key 1: " + map.get(1));
    }
}
