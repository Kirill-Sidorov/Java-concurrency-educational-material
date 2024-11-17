package org.example.concurrency.case14states;

public class IncreaseThread extends Thread {

    private Account account;

    public IncreaseThread(String name, Account account) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        try {
            account.increase(10);
        } catch (InterruptedException ignored) {
        }
    }
}
