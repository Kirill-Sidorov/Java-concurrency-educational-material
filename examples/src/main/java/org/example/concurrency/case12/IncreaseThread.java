package org.example.concurrency.case12;

public class IncreaseThread extends Thread {

    private Account account;

    public IncreaseThread(Account account) {
        this.account = account;
    }

    @Override
    public void run() {

        for (int i = 0; i < 200_000; i++) {
            account.increase(1);
        }

    }
}
