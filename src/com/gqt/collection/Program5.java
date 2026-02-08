package com.gqt.collection;

import java.util.HashMap;

public class Program5 {
	public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        System.out.println("Adding key-value pairs");
        map.put(1, "Java");
        map.put(2, "Python");
        System.out.println("----------------------");
        System.out.println("Value for key 1: " + map.get(1));
        System.out.println("Complete HashMap: " + map);
    }
}
