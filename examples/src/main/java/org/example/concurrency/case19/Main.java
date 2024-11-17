package org.example.concurrency.case19;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Task task1 = new Task("Задача 1");
        Task task2 = new Task("Задача 2");
        Task task3 = new Task("Задача 3");

        executorService.execute(task1);
        executorService.execute(task2);
        executorService.execute(task3);

        //executorService.shutdown();

        //executorService.execute(new Task(""));
    }
}
