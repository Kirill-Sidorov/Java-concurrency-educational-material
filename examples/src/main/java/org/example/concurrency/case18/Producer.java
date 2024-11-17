package org.example.concurrency.case18;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    private BlockingQueue<String> products;
    private String name;

    public Producer(BlockingQueue<String> products, String name) {
        this.products = products;
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            try {

                products.put("Товар от " + name);

                System.out.println(name + " сделал товар, количество элементов очереди - " + products.size());

            } catch (InterruptedException e) {
                System.out.println("Ошибка InterruptedException");
            }
        }
    }
}
