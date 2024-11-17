package org.example.concurrency.case14;

public class IncreaseThread extends Thread {

    private Account account;

    public IncreaseThread(String name, Account account) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Ошибка InterruptedException");
        }

        for (int i = 0; i < 2; i++) {

            account.increase(5); // 2 раза увеличиваем счет на 5

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Ошибка InterruptedException");
            }

        }

    }
}
