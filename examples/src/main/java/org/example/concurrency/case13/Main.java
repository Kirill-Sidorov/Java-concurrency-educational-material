package org.example.concurrency.case13;

public class Main {

    public static void main(String[] args) {

        State state1 = new State();
        State state2 = new State();

        MyRunnable1 myRunnable1 = new MyRunnable1(state1, state2);
        MyRunnable2 myRunnable2 = new MyRunnable2(state1, state2);

        Thread thread1 = new Thread(myRunnable1, "Thread1");
        Thread thread2 = new Thread(myRunnable2, "Thread2");

        thread1.start();
        thread2.start();
    }
}
