package com.lp.Thread;

import java.util.concurrent.locks.LockSupport;

public class MyFutureTask<V> implements Runnable{

    private MyCallable<V> myCallable;

    private Thread currentThread;

    public MyFutureTask(MyCallable myCallable) {
        this.myCallable = myCallable;
    }

    private V result;
    @Override
    public void run() {
        result = myCallable.call();
        LockSupport.unpark(currentThread);
    }


    public V get(){
        currentThread = Thread.currentThread();
        LockSupport.park();

        return result;
    }
}
