package org.example.concurrency.case12states;

public class DecreaseThread extends Thread {

    private Account account;

    public DecreaseThread(Account account) {
        this.account = account;
    }

    @Override
    public void run() {

        for (int i = 0; i < 2; i++) {
            account.decrease(1);
        }

    }
}
