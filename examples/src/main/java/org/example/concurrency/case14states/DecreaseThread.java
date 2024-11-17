package org.example.concurrency.case14states;

public class DecreaseThread extends Thread {

    private Account account;

    public DecreaseThread(String name, Account account) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        try {
            account.decrease(10);
        } catch (InterruptedException ignored) {
        }
    }
}
