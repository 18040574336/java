package com.lp.Thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;

public class Thread12 {
    public static void main(String[] args) {
        new Thread(new Waiting(),"WaitingTime").start();
        new Thread(new WaitingTime(),"Waiting").start();

        new Thread(new Blocked(),"Blocked1").start();
        new Thread(new Blocked(),"Blocked2").start();

    }


}


class  WaitingTime implements Runnable {


    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class Waiting implements Runnable {
    @Override
    public void run() {
       while (true){
           synchronized (WaitingTime.class){
               try {
                   WaitingTime.class.wait();
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
       }
    }
}
class Blocked implements Runnable {
    @Override
    public void run() {
           synchronized (WaitingTime.class){
               try {
                   TimeUnit.SECONDS.sleep(200);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
    }
}


