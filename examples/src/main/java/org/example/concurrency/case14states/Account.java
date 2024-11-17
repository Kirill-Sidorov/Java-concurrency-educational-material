package org.example.concurrency.case14states;

public class Account {

    private Thread increase;
    private Thread decrease;

    private long balance;

    public Account(long balance) {
        this.balance = balance;
    }

    // Увеличить счёт
    public synchronized void increase(long value) throws InterruptedException {
        balance += value;

        System.out.printf("'До вызова notify'    (+): %s; (-): %s\n", increase.getState(), decrease.getState());
        notify();
        System.out.printf("'После вызова notify' (+): %s; (-): %s\n", increase.getState(), decrease.getState());

        // сигнал отправили, но монитор не освободили
        Thread.sleep(3000);
    }

    // Уменьшить счёт
    public synchronized void decrease(long value) throws InterruptedException {

        while (balance - value < 0) {
            System.out.printf("(-) ждет, потому что: balance - value = %d\n", balance - value);

            wait(); //  освобождение монитора!!!!!!!

            System.out.printf("'Дождался освобождения монитора' (+): %s; (-): %s\n", increase.getState(), decrease.getState());
        }
        balance -= value;

        System.out.printf("(-) списал %d, balance = %d\n", value, balance);
    }


    public void setIncreaseThread(Thread increase) {
        this.increase = increase;
    }

    public void setDecreaseThread(Thread decrease) {
        this.decrease = decrease;
    }
}
