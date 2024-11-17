package org.example.concurrency.case3;

public class Main {

    public static void main(String[] args) {

        try {
            Thread.sleep(1000); // Задержка потока
        } catch (InterruptedException e) {
            System.out.println("Ошибка InterruptedException");
        }

        Thread currentThread = Thread.currentThread();

        System.out.println(currentThread.getName());
    }
}


