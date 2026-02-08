package com.gqt.collection;

import java.util.LinkedHashMap;

public class Program7 {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
		System.out.println("Adding key-value pairs");
		map.put(101, "One");
		map.put(102, "Two");
		map.put(103, "Three");
		System.out.println("LinkedHashMap Elements :");
		System.out.println(map);
		System.out.println("Value for key 1: " + map.get(1));
		System.out.println("---------------");
		for (Integer i : map.keySet()) {
			System.out.println(i+" -> "+map.get(i));
		}
	}
}
