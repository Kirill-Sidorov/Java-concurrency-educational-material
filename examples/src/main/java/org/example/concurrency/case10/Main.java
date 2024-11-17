package org.example.concurrency.case10;

public class Main {

    public static void main(String[] args) {

        MyRunnable myRunnable = new MyRunnable();

        Thread thread = new Thread(myRunnable);

        thread.start();

        try {
            Thread.sleep(3);
        } catch (InterruptedException e) {
            System.out.println("Ошибка InterruptedException");
        }

        thread.interrupt();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Ошибка InterruptedException");
        }

        System.out.println("Основной поток (main) завершил работу");
    }
}
