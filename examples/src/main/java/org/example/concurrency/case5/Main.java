package org.example.concurrency.case5;

public class Main {

    public static void main(String[] args) {
        Thread thread1 = new MyThread("Поток №1");
        Thread thread2 = new MyThread("Поток №2");
        Thread thread3 = new MyThread("Поток №3");
        Thread thread4 = new MyThread("Поток №4");
        Thread thread5 = new MyThread("Поток №5");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}


