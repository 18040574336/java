package com.lp.thread.create;


/**
 *  创建线程方式一：
 *  1、继承Thread类
 *  2、重写run()
 *  3、调用start()
 */

class Thread1Test extends  Thread{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            if (i%2 ==0){
                System.out.println(Thread.currentThread().getName()+i);
            }
        }
    }

}


public class Thread1  {

    public static void main(String[] args) {
        Thread1Test t1 =  new Thread1Test();
        //1、启动当前线程 2、调用当前线程run()
        t1.start();

        for (int i = 0; i <100 ; i++) {
            if (i%2 ==0){
                System.out.println(Thread.currentThread().getName()+i);
            }
        }

        //通过匿名类创建线程
//        new Thread(){
//            @Override
//            public void run() {
//                {
//                    for (int i = 0; i <100 ; i++) {
//                        if (i%2 ==0){
//                            System.out.println(Thread.currentThread().getName()+i);
//                        }
//                    }
//                }
//            }
//        }.start();
    }
}
