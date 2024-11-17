package org.example.concurrency.case12states;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Account account = new Account(2);

        System.out.println("Начальный баланс = " + account.getBalance());

        Thread increaseThread = new IncreaseThread(account); // (+)
        Thread decreaseThread = new DecreaseThread(account); // (-)

        account.setIncreaseThread(increaseThread);
        account.setDecreaseThread(decreaseThread);

        decreaseThread.start();
        increaseThread.start();

        increaseThread.join();
        decreaseThread.join();

        System.out.println("Конечный баланс = " + account.getBalance());

        //BLOCKED - A thread that is blocked waiting for a monitor lock is in this state.
    }
}
