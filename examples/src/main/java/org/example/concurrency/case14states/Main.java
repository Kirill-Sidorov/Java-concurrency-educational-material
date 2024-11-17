package org.example.concurrency.case14states;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Account account = new Account(0);

        Thread increaseThread = new IncreaseThread("(+)", account);
        Thread decreaseThread = new DecreaseThread("(-)", account);

        account.setIncreaseThread(increaseThread);
        account.setDecreaseThread(decreaseThread);

        decreaseThread.start();
        increaseThread.start();

        increaseThread.join();
        decreaseThread.join();
    }
}
