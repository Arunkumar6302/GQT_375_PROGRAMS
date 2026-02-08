package com.gqt.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Program18 {
	 public static void main(String[] args) {
	        ArrayList<Integer> list = new ArrayList<>();
	        System.out.println("Adding Elements into ArrayList : ");
	        list.add(10);
	        list.add(20);
	        list.add(30);
	        list.add(40);
	        System.out.println("list elements : "+list);
	        System.out.println("--------------------");
	        ListIterator<Integer> li = list.listIterator();
	        System.out.println("Itegerating List Using ListIterator:");
	        while (li.hasNext()) {
	            System.out.println(li.next());
	        }
	    }
}
