package org.example.concurrency.case4;

public class Main {

    public static void main(String[] args) {
        Thread thread1 = new MyThread();

        System.out.println(thread1.getState()); // NEW - новый, еще не запущенный поток
        System.out.println("thread1.isAlive() - " + thread1.isAlive());

        thread1.start(); // Запуск потока - start()

        System.out.println(thread1.getState()); // RUNNABLE - работающий поток
        System.out.println("thread1.isAlive() - " + thread1.isAlive());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Ошибка InterruptedException");
        }

        // Метод run() объекта thread1 закончил свое выполнение
        System.out.println(thread1.getState()); // TERMINATED - завершенный поток
        System.out.println("thread1.isAlive() - " + thread1.isAlive());

        // ЗАВЕРШЕННЫЙ ПОТОК НЕЛЬЗЯ ПЕРЕЗАПУСТИТЬ!!!

    }
}


