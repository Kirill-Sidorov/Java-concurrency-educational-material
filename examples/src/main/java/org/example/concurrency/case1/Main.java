package org.example.concurrency.case1;

public class Main {

    public static void main(String[] args) {
        Thread myThread = new MyThread();

        myThread.start(); // ! Поток запускается методом start();

        //myThread.start();
    }
}


