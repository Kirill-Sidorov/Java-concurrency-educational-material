package org.example.concurrency.case12;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Account account = new Account(400_000);

        System.out.println("Начальный баланс = " + account.getBalance());

        Thread increaseThread = new IncreaseThread(account); // (+)
        Thread decreaseThread = new DecreaseThread(account); // (-)

        StatePrinter statePrinter = new StatePrinter(increaseThread, decreaseThread);

        statePrinter.start();

        increaseThread.start();
        decreaseThread.start();

        increaseThread.join();
        decreaseThread.join();
        statePrinter.join();

        System.out.println("Конечный баланс = " + account.getBalance());

        //BLOCKED - A thread that is blocked waiting for a monitor lock is in this state.
    }
}
