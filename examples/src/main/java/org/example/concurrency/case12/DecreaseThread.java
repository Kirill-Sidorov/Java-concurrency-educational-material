package org.example.concurrency.case12;

public class DecreaseThread extends Thread {

    private Account account;

    public DecreaseThread(Account account) {
        this.account = account;
    }

    @Override
    public void run() {

        for (int i = 0; i < 200_000; i++) {
            account.decrease(1);
        }

    }
}
