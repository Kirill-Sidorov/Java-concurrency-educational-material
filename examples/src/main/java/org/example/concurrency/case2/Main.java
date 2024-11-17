package org.example.concurrency.case2;

public class Main {

    public static void main(String[] args) {
        Runnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);

        thread.start();
    }
}


