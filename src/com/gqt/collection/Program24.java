package com.gqt.collection;

import java.util.concurrent.*;
import java.util.Scanner;

class MyDelay implements Delayed {
	private long time;
	private String name;

	MyDelay(String name, long delay) {
		this.name = name;
		this.time = System.currentTimeMillis() + delay;
	}

	public long getDelay(TimeUnit unit) {
		return unit.convert(time - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
	}

	public int compareTo(Delayed d) {
		return Long.compare(this.time, ((MyDelay) d).time);
	}

	public String toString() {
		return name;
	}
}

public class Program24 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		DelayQueue<MyDelay> dq = new DelayQueue<>();
		System.out.print("Enter element: ");
		String val = sc.next();
		System.out.print("Enter delay (ms): ");
		long delay = sc.nextLong();
		dq.add(new MyDelay(val, delay));
		System.out.println("Retrieving element...");
		System.out.println("Received: " + dq.take());
	}
}
