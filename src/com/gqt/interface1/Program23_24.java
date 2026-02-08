package com.gqt.interface1;

interface Sendable {
    void send();
}

interface Receivable {
    void receive();
}

class Transmitter implements Sendable {
    public void send() {
        System.out.println("Sending data");
    }
}

class Receiver implements Receivable {
    public void receive() {
        System.out.println("Receiving data");
    }
}

public class Program23_24 {
    public static void main(String[] args) {
        Transmitter t = new Transmitter();
        Receiver r = new Receiver();

        t.send();
        r.receive();
    }
}

