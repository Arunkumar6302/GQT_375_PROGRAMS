package com.gqt.multiThreading;

class Table {
	void printTable(int n) {
		synchronized (this) {
			for (int i = 1; i <= 5; i++) {
				System.out.println(n+" * "+i+" = "+n * i);
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}

class MyThread2 extends Thread {
	Table t;
	int n;

	MyThread2(Table t, int n) {
		this.t = t;
		this.n = n;
	}

	public void run() {
		t.printTable(n);
	}
}

public class Program2 {
	public static void main(String[] args) {
        Table t = new Table();
        MyThread2 t1 = new MyThread2(t,5);
        MyThread2 t2 = new MyThread2(t,2);
        t1.start();
        t2.start();
    }
}
