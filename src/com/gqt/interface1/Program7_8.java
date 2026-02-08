package com.gqt.interface1;

interface MyList {
	void add();
	void remove();
	void contains();
}
interface MySet {
	void add();
	void remove();
	void contains();
}
class MyArrayList implements MyList {
	public void add() {
		System.out.println("ArrayList add");
	}
	public void remove() {
		System.out.println("ArrayList remove");
	}
	public void contains() {
		System.out.println("ArrayList contains");
	}
}
class MyHashSet implements MySet {
	public void add() {
		System.out.println("HashSet add");
	}
	public void remove() {
		System.out.println("HashSet remove");
	}
	public void contains() {
		System.out.println("HashSet contains");
	}
}
public class Program7_8 {
	public static void main(String[] args) {
		MyArrayList a = new MyArrayList();
		MyHashSet h = new MyHashSet();
		a.add();
		a.remove();
		a.contains();
		System.out.println("-----------------------------------");
		h.add();
		h.remove();
		h.contains();
	}
}
