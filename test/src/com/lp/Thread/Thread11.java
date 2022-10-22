package com.lp.Thread;

public class Thread11 implements Runnable{
    private    int ticket = 100;
    @Override
    public void run() {
        while(true){
                if (ticket > 0){
                    System.out.println(Thread.currentThread().getName()+"：票号："+ticket);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket--;

                } else {
                    break;
                }

        }
    }

    public static void main(String[] args) {
        Thread11 thread11 = new Thread11();
        new Thread(thread11).start();
        new Thread(thread11).start();
    }
}
