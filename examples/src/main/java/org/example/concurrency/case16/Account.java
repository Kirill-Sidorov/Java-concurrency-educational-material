package org.example.concurrency.case16;

public class Account {

    public volatile long balance;

    public Account(long balance) {
        this.balance = balance;
    }

    public void add(long value) {
        balance += value;

        // Тоже самое:
        // long newBalance = balance + value;
        // balance = newBalance;

        //
        // или
        // balance++
    }
}





