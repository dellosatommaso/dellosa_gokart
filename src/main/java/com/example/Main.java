package com.example;

public class Main {
    public static void main(String[] args) {
        Pilota p1 = new Pilota("ham");
        Pilota p2 = new Pilota("rus");
        Pilota p3 = new Pilota("sai");
        Pilota p4 = new Pilota("lec");
        Pilota p5 = new Pilota("nor");
        Pilota p6 = new Pilota("pia");
        Pilota p7 = new Pilota("mag");
        Pilota p8 = new Pilota("hul");

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();
        p8.start();
    }
}