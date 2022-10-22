package com.lp.Thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.LockSupport;

public class Thread09 {

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(4, new Runnable() {
            @Override
            public void run() {
                System.out.println(">>>>>>>>>>>>>>>>>");
            }
        });

        for (int i =0;i<40;i++){
            Thread thread = new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + "到了");
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } catch (BrokenBarrierException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + "执行");

            });
            thread.start();
            LockSupport.parkNanos(1000*1000*1000L);
        }
    }
}
