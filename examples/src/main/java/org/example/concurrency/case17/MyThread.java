package org.example.concurrency.case17;

public class MyThread extends Thread {

    private Account account;

    public MyThread(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            account.inc();
        }
    }
}
