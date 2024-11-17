package org.example.concurrency.case14;

public class Main {

    public static void main(String[] args) {

        Account account = new Account(20); // изначальный баланс 20

        Thread increaseThread = new IncreaseThread("(+)", account);
        Thread decreaseThread = new DecreaseThread("(-)", account);

        increaseThread.start();
        decreaseThread.start();

        try {
            increaseThread.join();
            decreaseThread.join();
        } catch (InterruptedException e) {
            System.out.println("Ошибка InterruptedException");
        }
    }
}
