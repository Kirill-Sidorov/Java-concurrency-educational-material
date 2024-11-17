package org.example.concurrency.case7;

public class Main {

    public static void main(String[] args) {

        MyThread thread = new MyThread("MyThread");

        thread.start();

        System.out.println("Основной поток (main) завершил работу");
    }
}







/*
        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println("Ошибка InterruptedException");
        }
 */