package org.example.concurrency.case1;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("MyThread running");
        // Выполнение какой-то работы
        System.out.println("MyThread finished");
    }
}


