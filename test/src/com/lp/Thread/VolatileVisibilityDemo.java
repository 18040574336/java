package com.lp.Thread;
//
//class DataNum{
//       int i = 0;
//}
//
//public class VolatileVisibilityDemo {
//
//
//    public static void main(String[] args) {
//        VolatileVisibilityDemo volatileVisibilityDemo = new VolatileVisibilityDemo();
//        DataNum dataNum = new DataNum();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                int a = 0;
//                System.out.println("here i am...");
//                while(dataNum.i == 0){
//                    a++;
//                }
//                System.out.println("i=" + a);
//
//            }
//        }).start();
//
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        dataNum.i = 1;
//
//        System.out.println("程序已经结束");
//    }
//
//
//}


import java.util.concurrent.TimeUnit;

class MyTest
{
    public  int number = 0;
    public void changeNumber(){
        number = 100;
    }
}

public class VolatileVisibilityDemo {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();

        new Thread(() -> {
            System.out.println(String.format("线程%s开始执行", Thread.currentThread().getName()));

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            myTest.changeNumber();
            System.out.println(String.format("线程%s的number：%d", Thread.currentThread().getName(), myTest.number));
        }, "NewThread").start();

        while (myTest.number == 0){
            System.out.println("===");
        }

        System.out.println("执行完毕");
    }
}
