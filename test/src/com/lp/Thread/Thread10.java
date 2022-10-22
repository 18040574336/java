package com.lp.Thread;

import java.util.concurrent.atomic.AtomicInteger;

public class Thread10 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        System.out.println(atomicInteger.incrementAndGet());
        System.out.println(atomicInteger.getAndIncrement());
        System.out.println(atomicInteger.get());

        int i = 0;
        System.out.println(++i);
        System.out.println(i++);
    }
}
