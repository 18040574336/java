package com.lp.Thread;

import java.util.concurrent.TimeUnit;

public class Thread15 {

    public static void main(String[] args) {
        final Object objectA = new Object();
        final Object objectB = new Object();

        new Thread(() -> {
            synchronized (objectA) {
                System.out.println(Thread.currentThread().getName() + "\t" + "AAAA");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (objectB) {
                    System.out.println(Thread.currentThread().getName() + "\t" + "BBBB");
                }
            }

        }, "A").start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        new Thread(() -> {
            synchronized (objectB) {
                System.out.println(Thread.currentThread().getName() + "\t" + "BBB");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (objectA) {
                    System.out.println(Thread.currentThread().getName() + "\t" + "AAAA");
                }
            }

        }, "B").start();
    }
}
