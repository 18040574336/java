package com.lp.Thread;

public class MyCallableImpl implements MyCallable<Integer>{
    @Override
    public Integer call() {

        try {
            System.out.println("子线程在执行");
            Thread.sleep(3000);
        } catch (InterruptedException e) {


        }
        return 1;
    }
}
