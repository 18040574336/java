package com.lp.thread.create;


/**
 * 创建多线程方式二：
 *
 * 1、创建一个实现Runnable的接口的类
 * 2、实现类去实现Runnable中的抽象方法：run()
 * 3、创建实现类的对象
 * 4、将此对象作为参数传递到Thread的构造函数中，创建Thread的对象
 * 5、通过Thread类的对象调用start()
 *
 *
 *
 * 比较创建线程的两种方式：
 * 开发中：优先选择：实现Runnable接口的方式
 * 原因：1、实现的方式没有类的单继承的局限性。
 *      2、实现的方式更适合来处理多个线程有共享数据的情况。
 * 联系：public class Thread implements Runnable
 * 相同点：两种方式都需要重写run(),将线程要执行的逻辑声明在run()中。
 *
 */

class Thread2Test implements  Runnable{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            if (i%2 ==0){
                System.out.println(Thread.currentThread().getName()+i);
            }
        }
    }
}


public class Thread2 {
    public static void main(String[] args) {
        Thread2Test thread2Test = new Thread2Test();
        new Thread(thread2Test).start();
        //在启动一个线程
        new Thread(thread2Test).start();

    }




}
