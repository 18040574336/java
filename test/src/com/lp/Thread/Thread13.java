package com.lp.Thread;

public class Thread13 {
    private static int i =10;

    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                i++;
                try {
                    Thread.sleep(5000);
                    System.out.println(i);
                    System.out.println("thread end");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    System.out.println(i);
                    i++;
                    Thread.sleep(5000);
                    System.out.println("thread1 end");

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        });

        thread.start();
        thread1.start();
    }

}
