package ru.job4j.concurrent;

import java.util.Random;

public class Wget {
    public static void main(String[] args) {
        Random random = new Random();

        Thread thread = new Thread(
            () -> {
                try {
                    for (int i = 1; i <= 100; i++) {
                        random.setSeed(System.currentTimeMillis());
                        System.out.print("\rLoading: " + i + "%");
                        Thread.sleep(random.nextInt(2000));
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        );
        thread.start();
    }
}
