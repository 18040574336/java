package com.lp.Thread;

import javax.swing.table.TableRowSorter;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadCallable  implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName()+":子线程开始");
        Thread.sleep(1000);
        return "hello world!";
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {

     
        ThreadCallable threadCallable = new ThreadCallable();
        FutureTask<String> futureTask = new FutureTask<String>(threadCallable);
        new Thread(futureTask,"test:").start();
        String s = futureTask.get();
        System.out.println("s");
        System.out.println("main finished");

    }
}
