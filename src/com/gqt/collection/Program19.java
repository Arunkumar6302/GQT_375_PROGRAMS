package com.gqt.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Program19 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Adding Elements into ArrayList : ");
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println("list elements : " + list);
		System.out.println("--------------------");

		Iterator<Integer> it = list.iterator();
		System.out.println("Using Iterator:");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
