package org.example.concurrency.case18;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    private BlockingQueue<String> products;

    public Consumer(BlockingQueue<String> products) {
        this.products = products;
    }

    @Override
    public void run() {
        while (true) {
            try {

                String product = products.take();

                System.out.println("        Потребитель получил " + product + " , количество элементов очереди - " + products.size());

                Thread.sleep(500);

            } catch (InterruptedException e) {
                System.out.println("Ошибка InterruptedException");
            }
        }
    }
}
