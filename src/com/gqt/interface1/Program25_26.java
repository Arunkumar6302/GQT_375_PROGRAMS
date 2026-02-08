package com.gqt.interface1;

interface Encryptable1 {
	void encrypt();
}

interface Decryptable1 {
	void decrypt();
}

class Encoder1 implements Encryptable1 {
	public void encrypt() {
		System.out.println("Encryption algorithm running");
	}
}

class Decoder1 implements Decryptable1 {
	public void decrypt() {
		System.out.println("Decryption algorithm running");
	}
}

public class Program25_26 {
	public static void main(String[] args) {
		Encoder1 e = new Encoder1();
		Decoder1 d = new Decoder1();

		e.encrypt();
		d.decrypt();
	}
}
