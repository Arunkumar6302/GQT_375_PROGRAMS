package com.gqt.interface1;

interface Encryptable {
    void encrypt();
}

interface Decryptable {
    void decrypt();
}

class Encoder implements Encryptable {
    public void encrypt() {
        System.out.println("Encrypting data");
    }
}

class Decoder implements Decryptable {
    public void decrypt() {
        System.out.println("Decrypting data");
    }
}

public class Program15_16 {
    public static void main(String[] args) {
        Encoder e = new Encoder();
        Decoder d = new Decoder();

        e.encrypt();
        d.decrypt();
    }
}
