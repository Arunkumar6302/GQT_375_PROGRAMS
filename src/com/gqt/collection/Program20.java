package com.gqt.collection;

import java.util.concurrent.ArrayBlockingQueue;

public class Program20 {
	public class P21_ArrayBlockingQueue {
		public static void main(String[] args) {
			ArrayBlockingQueue<Integer> q = new ArrayBlockingQueue<>(3);

			q.add(10);
			q.add(20);
			q.add(30);

			System.out.println("ArrayBlockingQueue: " + q);
		}
	}
}
