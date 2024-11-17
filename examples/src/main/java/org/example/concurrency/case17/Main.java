package org.example.concurrency.case17;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Account account = new Account(0);

        MyThread thread1 = new MyThread(account);
        MyThread thread2 = new MyThread(account);
        MyThread thread3 = new MyThread(account);

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println(account.get());
    }
}
