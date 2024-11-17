package org.example.concurrency.case8;

public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Ошибка InterruptedException");
        }

        System.out.printf("Поток %s завершил работу\n", getName());
    }
}
