package com.gqt.multiThreading;
import java.util.concurrent.*;

class MyyTask1 implements Callable<Integer> {
	public Integer call() {
		System.out.println("Task-1 executing");
		return 10;
	}
}

class MyyTask2 implements Callable<Integer> {
	public Integer call() {
		System.out.println("Task-2 executing");
		return 20;
	}
}

public class Program23 {
	public static void main(String[] args) throws Exception {
		ExecutorService service = Executors.newFixedThreadPool(2);
		CompletionService<Integer> cs = new ExecutorCompletionService<>(service);
		cs.submit(new MyyTask1());
		cs.submit(new MyyTask2());
		System.out.println("Result: " + cs.take().get());
		System.out.println("Result: " + cs.take().get());
		service.shutdown();
	}
}
