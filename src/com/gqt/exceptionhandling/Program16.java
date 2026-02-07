package com.gqt.exceptionhandling;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public class Program16 {
	public static void main(String[] args) {
		try {
			ArrayList<Integer> list = new ArrayList<>();
			list.add(10);
			list.add(20);

			for (Integer i : list) {
				list.add(30);
			}
		} catch (ConcurrentModificationException e) {
			System.out.println("Concurrent modification occurred");
		}
	}
}
