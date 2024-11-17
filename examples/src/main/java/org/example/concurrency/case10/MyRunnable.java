package org.example.concurrency.case10;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        Thread currentThread = Thread.currentThread();

        while (!currentThread.isInterrupted()) {
            System.out.println("MyRunnable работает");
        }

        System.out.println("MyRunnable завершил работу");
    }
}
