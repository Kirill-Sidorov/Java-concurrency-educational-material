package org.example.concurrency.case21;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Задача 1"));
        tasks.add(new Task("Задача 2"));
        tasks.add(new Task("Задача 3"));
        tasks.add(new Task("Задача 4"));
        tasks.add(new Task("Задача 5"));

        try {

            String result = executorService.invokeAny(tasks);
            System.out.println(result);

        } catch (InterruptedException | ExecutionException e) {
            System.out.println("Ошибка");
        }

        executorService.shutdown();
    }
}
