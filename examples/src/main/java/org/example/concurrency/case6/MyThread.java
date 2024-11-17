package org.example.concurrency.case6;

public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        String name = getName();
        for (int i = 0; i < 10; i++) {
            System.out.println("Сейчас работает " + name);
        }
    }
}


