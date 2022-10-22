package com.lp.Thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread06 {

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("1111");
        });
        Thread thread2 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("2222");
        });
        Thread thread3 = new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("3333");
        });
        Thread thread4 = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("4444");
        });


        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(thread1);
        executorService.execute(thread2);
        executorService.execute(thread3);
        executorService.execute(thread4);

        System.out.println("main end");

    }


}
