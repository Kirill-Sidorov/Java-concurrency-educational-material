package org.example.concurrency.case21;

import java.util.concurrent.Callable;

public class Task implements Callable<String> {

    private String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        return name + " - результат выполнения";
    }
}
