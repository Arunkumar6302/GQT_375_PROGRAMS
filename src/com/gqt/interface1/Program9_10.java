package com.gqt.interface1;

interface Printable {
    void print();
}
interface Scannable {
    void scan();
}
class Printer implements Printable {
    public void print() {
        System.out.println("Printing document");
    }
}
class ScannerDevice implements Scannable {
    public void scan() {
        System.out.println("Scanning document");
    }
}
public class Program9_10 {
    public static void main(String[] args) {
        Printer p = new Printer();
        ScannerDevice s = new ScannerDevice();
        p.print();
        s.scan();
    }
}

