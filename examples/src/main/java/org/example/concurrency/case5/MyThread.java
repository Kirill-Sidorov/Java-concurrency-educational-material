package org.example.concurrency.case5;

public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        String name = getName();
        System.out.println(name);
    }
}


