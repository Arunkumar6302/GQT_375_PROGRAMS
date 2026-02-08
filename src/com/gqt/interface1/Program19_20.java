package com.gqt.interface1;

interface Playable {
    void play();
}

interface Recordable {
    void record();
}

class MusicPlayer implements Playable {
    public void play() {
        System.out.println("Playing music");
    }
}

class Recorder implements Recordable {
    public void record() {
        System.out.println("Recording audio");
    }
}

public class Program19_20 {
    public static void main(String[] args) {
        MusicPlayer m = new MusicPlayer();
        Recorder r = new Recorder();

        m.play();
        r.record();
    }
}

