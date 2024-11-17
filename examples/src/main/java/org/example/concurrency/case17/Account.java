package org.example.concurrency.case17;

import java.util.concurrent.atomic.AtomicLong;

public class Account {

    public AtomicLong balance;

    public Account(long value) {
        this.balance = new AtomicLong(value);
    }

    public void inc() {

        boolean success = false;
        while(!success) {
            long expValue = balance.get();
            long newValue = expValue + 1;

            success = balance.compareAndSet(expValue, newValue); // основной метод ВСЕХ Atomic классов
        }
    }

    public void inc2() {

        // готовая реализация
        balance.incrementAndGet();

        // либо
        balance.updateAndGet(oldBalance -> oldBalance + 1);
    }

    public long get() {
        return balance.get();
    }
}



