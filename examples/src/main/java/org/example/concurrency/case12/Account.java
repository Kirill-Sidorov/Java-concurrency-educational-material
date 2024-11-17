package org.example.concurrency.case12;

public class Account {

    private long balance;

    public Account(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    // Увеличить счёт
    public void increase(long value) {

        synchronized (this) {
            balance += value;
        }

    }

    // Уменьшить счёт
    public void decrease(long value) {

        synchronized (this) {
            balance -= value;
        }

    }
}
