package org.example.concurrency.case2;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("MyRunnable running");
        // Выполнение какой-то работы
        System.out.println("MyRunnable finished");
    }
}


