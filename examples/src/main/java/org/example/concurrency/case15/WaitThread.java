package org.example.concurrency.case15;

public class WaitThread extends Thread {

    private final Signal signal;

    // Ожидающий поток
    public WaitThread(String name, Signal signal) {
        super(name);
        this.signal = signal;
    }

    @Override
    public void run() {
        try {
            signal.waitBlock();
        } catch (InterruptedException e) {
            System.out.println("Ошибка InterruptedException");
        }
    }
}


