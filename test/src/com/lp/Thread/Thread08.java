package com.lp.Thread;

import java.util.concurrent.CountDownLatch;

public class Thread08 {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(4);
        System.out.println(countDownLatch.getCount());
        countDownLatch.countDown();
        System.out.println(countDownLatch.getCount());
        countDownLatch.countDown();
        System.out.println(countDownLatch.getCount());
        countDownLatch.countDown();
        System.out.println(countDownLatch.getCount());
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("====");
    }
}
