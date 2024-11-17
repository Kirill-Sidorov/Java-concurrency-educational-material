package org.example.concurrency.case20;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Task task = new Task("Задача 1");

        // Future - это будущий результат работы Задачи 1
        Future<String> future = executorService.submit(task);

        try {

            String result = future.get(); // метод get() блокирующий вызов
            System.out.println(result);

        } catch (InterruptedException | ExecutionException e) {
            System.out.println("Ошибка");
        }
    }
}
