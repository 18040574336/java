package com.lp.Thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;

public class Thread02  extends  Thread{

    public Thread02(String name) {
        super(name);
    }

    private static  AtomicInteger atomicInteger = new AtomicInteger();

    @Override
    public void run() {
       for (int i =0;i<10000;i ++){
           atomicInteger.addAndGet(1);
       }
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Future <String> future = service.submit(()->{return  "aa";});
        String s = future.get();
        System.out.println(s );
//        Thread02 thread1 = new Thread02("T1");
//        Thread02 thread2 = new Thread02("T2");
//
//        thread1.start();
//        thread2.start();
//
//        thread1.join();
//        thread2.join();
//
//        System.out.println("sum==="+atomicInteger.get());
    }


}
