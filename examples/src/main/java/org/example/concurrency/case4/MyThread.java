package org.example.concurrency.case4;

public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Ошибка InterruptedException");
        }
    }
}


