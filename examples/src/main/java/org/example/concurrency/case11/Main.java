package org.example.concurrency.case11;

public class Main {

    public static void main(String[] args) {

        MyThread thread = new MyThread();

        thread.start();

        thread.interrupt();

        System.out.println("Основной поток (main) завершил работу");
    }
}
