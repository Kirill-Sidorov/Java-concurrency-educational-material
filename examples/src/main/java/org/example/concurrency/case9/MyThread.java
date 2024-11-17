package org.example.concurrency.case9;

public class MyThread extends Thread {

    @Override
    public void run() {
        while (!isInterrupted()) {
            System.out.println("Поток MyThread работает");
        }
        System.out.println("Поток MyThread завершил работу");
    }
}
