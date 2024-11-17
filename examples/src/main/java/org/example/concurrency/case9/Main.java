package org.example.concurrency.case9;

public class Main {

    public static void main(String[] args) {

        MyThread thread = new MyThread();

        thread.start();

        try {
            Thread.sleep(3);
        } catch (InterruptedException e) {
            System.out.println("Ошибка InterruptedException");
        }

        thread.interrupt();

        // thread.stop(); !!! метод помечен как устаревший (@Deprecated) !!!
        // Так как метод stop() не гарантировал в каком состоянии будет остановлен поток !!!
        // Вместо stop() нужно использовать свою реализацию !!!
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Ошибка InterruptedException");
        }

        System.out.println("Основной поток (main) завершил работу");
    }
}
