package org.example.concurrency.case14;

public class DecreaseThread extends Thread {

    private Account account;

    public DecreaseThread(String name, Account account) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {

        for (int i = 0; i < 3; i++) {
            account.decrease(10); // 3 раза пытаемся списать 10
        }

    }
}
