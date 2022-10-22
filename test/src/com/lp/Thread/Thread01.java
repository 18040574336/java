package com.lp.Thread;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Thread01  {
    private  Lock lock = new ReentrantLock();
    private  Condition condition =  lock.newCondition();
    public static void main(String[] args) throws InterruptedException {
       Thread01 thread01 = new Thread01();
       thread01.cal();
        Thread.sleep(1000);
        thread01.signal();


    }

    private void signal(){
        try {
            lock.lock();
            condition.signal();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            lock.unlock();
        }
    }
    private void cal(){
        new Thread(()->{
            try {
                lock.lock();
                System.out.println("11111");
                condition.await();
                System.out.println("22222");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }finally {
                lock.unlock();
            }
        }).start();



    }

}
