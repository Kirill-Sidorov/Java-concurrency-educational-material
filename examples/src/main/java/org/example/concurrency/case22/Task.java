package org.example.concurrency.case22;

import java.util.concurrent.Callable;

public class Task implements Callable<String> {

    private String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return name + " - результат выполнения";
    }
}
