package ru.job4j.concurrent;

public class ThreadState {
    public static void main(String[] args) {
        Thread first = new Thread(
            () -> System.out.println(Thread.currentThread().getName())
        );
        Thread second = new Thread(
            () -> System.out.println(Thread.currentThread().getName())
        );
        System.out.println("first: name: " + first.getName()
            + " state: " + first.getState());
        System.out.println("second: name: " + second.getName()
            + " state: " + second.getState());
        first.start();
        second.start();
        while (first.getState() != Thread.State.TERMINATED
            || second.getState() != Thread.State.TERMINATED) {
            System.out.println("first: name: " + first.getName()
                + " state: " + first.getState());
            System.out.println("second: name: " + second.getName()
                + " state: " + second.getState());
        }
        System.out.println("first: name: " + first.getName()
            + " state: " + first.getState());
        System.out.println("second: name: " + second.getName()
            + " state: " + second.getState());
        System.out.println("current: name: " + Thread.currentThread().getName()
            + " state: " + Thread.currentThread().getState());
        System.out.println("Work is end!");
    }
}
