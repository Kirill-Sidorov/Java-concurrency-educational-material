package org.example.concurrency.case20;

import java.util.concurrent.Callable;

public class Task implements Callable<String> {

    private String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        System.out.println("Выполняется - " + name);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Ошибка InterruptedException");
        }

        return name + " - результат выполнения";
    }
}
