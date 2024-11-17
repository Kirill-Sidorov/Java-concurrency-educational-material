package org.example.concurrency.case23;

public class Task implements Runnable {

    private String name;

    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }

        System.out.println(name + " - результат выполнения");
    }
}
