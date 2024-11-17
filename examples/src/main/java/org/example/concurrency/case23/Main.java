package org.example.concurrency.case23;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(1);

        executorService.execute(new Task("Задача 1"));
        executorService.execute(new Task("Задача 2"));
        executorService.execute(new Task("Задача 3"));

        List<Runnable> notExecutedTasks = executorService.shutdownNow();

        for (Runnable runnable : notExecutedTasks) {
            Task task = (Task) runnable;
            System.out.println("Незавершенная задача: " + task.getName());
        }
    }
}
