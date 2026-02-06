package com.gqt.Strings;

import java.util.HashMap;

public class Program14 {
	public static void main(String[] args) {
		String s = "programming";
		System.out.println("String :" + s);
		HashMap<Character, Integer> map = new HashMap<>();

		for (char ch : s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		for (Character key : map.keySet()) {
			System.out.println(key + " -> " + map.get(key));
		}
	}
}
