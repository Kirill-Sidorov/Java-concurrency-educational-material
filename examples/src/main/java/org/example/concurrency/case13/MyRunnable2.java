package org.example.concurrency.case13;

public class MyRunnable2 implements Runnable {

    private State state1;
    private State state2;

    public MyRunnable2(State state1, State state2) {
        this.state1 = state1;
        this.state2 = state2;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();

        synchronized (state2) {
            System.out.println(name + " захватил доступ к объекту State2");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Ошибка InterruptedException");
            }

            System.out.println(name + " ожидает освобождения State1");
            synchronized (state1) {
                System.out.println(name + " захватил доступ к объекту State1");

                // Какая-то работа
            }
        }
    }
}
