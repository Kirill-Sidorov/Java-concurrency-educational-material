package org.example.concurrency.case8;

public class Main {

    public static void main(String[] args) {

        MyThread thread = new MyThread("MyThread");

        thread.start();

        System.out.println("Основной поток (main) завершил работу");
    }
}





//thread.setDaemon(true);