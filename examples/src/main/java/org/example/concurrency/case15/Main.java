package org.example.concurrency.case15;

public class Main {

    public static void main(String[] args) {
        Signal signal = new Signal();

        Thread thread1 = new WaitThread("Ожидающий 1", signal);
        Thread thread2 = new WaitThread("Ожидающий 2", signal);
        Thread thread3 = new WaitThread("Ожидающий 3", signal);

        thread1.start();
        thread2.start();
        thread3.start();

        Thread thread4 = new NotifyThread("Освободитель", signal);
        thread4.start();
    }
}


