package org.example.concurrency.case15;

public class NotifyThread extends Thread {

    private final Signal signal;

    // Поток освободитель
    public NotifyThread(String name, Signal signal) {
        super(name);
        this.signal = signal;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Ошибка InterruptedException");
        }
        signal.releaseThreads();
    }

}
