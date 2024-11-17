package org.example.concurrency.case11;

public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(2000); // или wait() или join()
        } catch (InterruptedException e) {
            System.out.println("Ошибка InterruptedException");
        }
        System.out.println("Поток MyThread завершил работу");
    }
}
