package org.example.concurrency.case6;

public class Main {

    public static void main(String[] args) {
        Thread thread1 = new MyThread("Поток №1");
        Thread thread2 = new MyThread("Поток №2");

        thread1.start();
        thread2.start();
    }
}


