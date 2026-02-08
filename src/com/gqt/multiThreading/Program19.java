package com.gqt.multiThreading;

import java.util.concurrent.Phaser;

public class Program19 {
	public static void main(String[] args) {
		System.out.println("Main thread started");
		Phaser phaser = new Phaser(1);
		System.out.println("Phaser created with 1 registered party");
		System.out.println("Current Phase: " + phaser.getPhase());
		System.out.println("Registered Parties: " + phaser.getRegisteredParties());
		System.out.println("Registered Parties after deregister: " + phaser.getRegisteredParties());
		System.out.println("Main thread finished");
	}
}
