package org.example.concurrency.case12;

import static java.lang.Thread.State.TERMINATED;

public class StatePrinter extends Thread {

    private Thread increase;
    private Thread decrease;

    public StatePrinter(Thread increase, Thread decrease) {
        this.increase = increase;
        this.decrease = decrease;
    }

    @Override
    public void run() {
        while (true) {

            System.out.println("(+): " + increase.getState()
                    + "; (-): " + decrease.getState());


            if (TERMINATED.equals(increase.getState()) &&
                    TERMINATED.equals(decrease.getState())) {
                break;
            }
        }

        System.out.println("(+): " + increase.getState()
                + "; (-): " + decrease.getState());

    }
}
