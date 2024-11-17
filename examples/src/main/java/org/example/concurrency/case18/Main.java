package org.example.concurrency.case18;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {

    public static void main(String[] args) {
        BlockingQueue<String> products = new ArrayBlockingQueue<>(3);

        Producer producer1 = new Producer(products, "Producer1");
        Producer producer2 = new Producer(products, "Producer2");

        Consumer consumer = new Consumer(products);

        Thread thread1 = new Thread(producer1);
        Thread thread2 = new Thread(producer2);

        Thread thread3 = new Thread(consumer);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
