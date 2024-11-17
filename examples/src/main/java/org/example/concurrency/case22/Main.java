package org.example.concurrency.case22;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Задача 1"));
        tasks.add(new Task("Задача 2"));
        tasks.add(new Task("Задача 3"));

        try {

            List<Future<String>> futures = executorService.invokeAll(tasks);
            System.out.println("Все задачи выполнились");

            for (Future<String> future : futures) {
                System.out.println(future.get());
            }

        } catch (InterruptedException | ExecutionException e) {
            System.out.println("Ошибка");
        }

        executorService.shutdown();
    }
}
