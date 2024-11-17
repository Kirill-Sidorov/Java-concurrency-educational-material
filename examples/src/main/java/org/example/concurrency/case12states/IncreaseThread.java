package org.example.concurrency.case12states;

public class IncreaseThread extends Thread {

    private Account account;

    public IncreaseThread(Account account) {
        this.account = account;
    }

    @Override
    public void run() {

        for (int i = 0; i < 2; i++) {
            account.increase(1);
        }

    }
}
