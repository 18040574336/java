package com.lp;


import com.lp.Thread.Thread01;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.stream.Collectors;

public class MapTest {

    private static final int threadCount = 200;

    public static void main(String[] args) throws Exception {
        CountDownLatch countDownLatch = new CountDownLatch(threadCount);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < threadCount; i++) {
            final int threadNum = i;
            executorService.execute(() -> {
                try {
                    Thread.sleep(1);
                    test(threadNum);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                } finally {
                    countDownLatch.countDown();
                }
            });

        }
        countDownLatch.await(10,TimeUnit.MILLISECONDS);
        System.out.println("finish");
    }


    public static void test(int threadNum)  {
        System.out.println(threadNum);
    }

    @Test
    public void test1(){

             Student s = new Student(1,"Z"){
                 @Override
                 public void say() {
                     System.out.println(3333);
                 }
             };


    }

    @Test
    public void test3(){

     ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(3);
     arrayBlockingQueue.add("1");
     arrayBlockingQueue.add("2");
     arrayBlockingQueue.add("3");
     arrayBlockingQueue.add("4");


    }

    public String test2(){
        AtomicReference<Thread> atomicReference = new AtomicReference<>();
        try {
            System.out.println(111);
            System.out.println(2222);
            return  "123";
        }finally {
            System.out.println(333);
            return "456";
        }
    }


}
