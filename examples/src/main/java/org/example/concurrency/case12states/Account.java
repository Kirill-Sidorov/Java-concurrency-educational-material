package org.example.concurrency.case12states;

public class Account {

    private Thread increase;
    private Thread decrease;

    private long balance;

    public Account(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    // Увеличить счёт
    public void increase(long value) {

        System.out.println("Increase ДО     synchronized (+): " + increase.getState() + "; (-): " + decrease.getState());
        synchronized (this) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Increase ВНТУРИ synchronized (+): " + increase.getState() + "; (-): " + decrease.getState());
            balance += value;
        }

    }

    // Уменьшить счёт
    public void decrease(long value) {

        System.out.println("Decrease ДО     synchronized (+): " + increase.getState() + "; (-): " + decrease.getState());
        synchronized (this) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Decrease ВНТУРИ synchronized (+): " + increase.getState() + "; (-): " + decrease.getState());
            balance -= value;
        }

    }


    public void setIncreaseThread(Thread increaseThread) {
        this.increase = increaseThread;
    }

    public void setDecreaseThread(Thread decreaseThread) {
        this.decrease = decreaseThread;
    }
}
