package org.example.concurrency.case14;

public class Account {

    private long balance;

    public Account(long balance) {
        this.balance = balance;
    }

    // Увеличить счёт
    public synchronized void increase(long value) {
        balance += value;
        System.out.printf("Поток %s отправил сигнал о пополнение счета, balance = %d\n",
                Thread.currentThread().getName(), balance);
        notify(); // this.notify()
    }

    // Уменьшить счёт
    public synchronized void decrease(long value) {

        while (balance - value < 0) {

                System.out.printf("Поток %s ждет, потому что: balance - value = %d\n",
                        Thread.currentThread().getName(), balance - value);

            try {
                wait(1000); //  освобождение монитора!!!!!!!
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.printf("Поток %s получил сигнал о пополнении счета\n",
                        Thread.currentThread().getName());


        }
        balance -= value;

        System.out.printf("Поток %s списал %d, balance = %d\n",
                Thread.currentThread().getName(), value, balance);
    }
}
