package com.lp.Thread;

public class VolatileVisibilityTest {
    private static boolean initFlag = false;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("1 " + Thread.currentThread().getName());
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("等待数据准备。。");
                while (!initFlag) {
                    System.out.println("2 " + Thread.currentThread().getName());
                }
                System.out.println("==================数据准备完毕，执行程序逻辑");
            }
        }).start();
        Thread.sleep(100);

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("3 " + Thread.currentThread().getName());
                prepareData();
            }
        }).start();
    }

    private static void prepareData() {
        System.out.println("数据准备了ing。。。。。");
        initFlag = true;
        System.out.println("数据准备ok。");
    }

}