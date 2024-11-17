package org.example.concurrency.case19;

public class Task implements Runnable {

    private String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        System.out.println("Выполняется - " + name);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Ошибка InterruptedException");
        }
    }
}
