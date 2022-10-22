package com.lp.Thread;

import com.lp.Student;

import java.util.ArrayList;
import java.util.concurrent.*;

public class Thread14 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(3);
        CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(5);
                return "1245";
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },threadPool).whenComplete((v,e)->{
            System.out.println(v);
        }).exceptionally(e->{e.printStackTrace();return  null;});
        System.out.println("11");

    }
}
