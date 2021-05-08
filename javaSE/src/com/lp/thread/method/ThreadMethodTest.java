package com.lp.thread.method;

/**
 * 线程中常用方法
 * 1、start():启动当前线程，调用当前线程的run()。
 * 2、run():通常需要重写Thread类中的此方法，将创建的线程要执行的操作声明在此方法中。
 * 3、currentThread():静态方法，返回执行当前代码的线程。
 * 4、getName():获取当前线程的名字。
 * 5、setName()：设置当前线程的名字。
 * 6、yield():释放当前cpu的执行权，有可能下一刻也分配到此线程上。
 * 7、join():在线程a中调用线程b的jion()方法时,此时线程a进入阻塞状态,至到线程b完全执行完成后，线程a结束阻塞状态。
 * 8、stop():此方法已过时。当执行此方法时，强制结束当前线程。
 * 9、sleep(long millis):让当前线程"睡眠",单位毫秒,在此时间内当前线程是阻塞状态。
 * 10、isAlive(): 判断此线程是否存活。
 *
 *
 *
 * 优先级
 * 1、MIN_PRIORITY = 1
 *   NORM_PRIORITY = 5 默认优先级
 *   MAX_PRIORITY = 10
 * 2、如何获取和设置当前线程的优先级：
 *    setPriority(int p) :设置线程的优先级
 *    getPriority()：获取线程的优先级
 *
 *   说明：高优先级的线程要抢占低优先级线程的cpu的执行权。但是只是从概率上讲，高优先级的线程
 *   高概率的情况下被执行。并不意味着只有当高优先级的线程执行完以后，低优先级的线程才执行完。
 *
 */
class ThreadMethod extends Thread{

    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            if (i%2 ==0){

                 //sleep(long millis):让当前线程"睡眠",单位毫秒,在此时间内当前线程是阻塞状态
//                try {
//
//                    this.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.println(Thread.currentThread().getName()+":"+Thread.currentThread().getPriority()+":"+i);
            }
//            if (i%20==0){
//                //释放当前cpu的执行权，有可能下一刻也分配到此线程上
//                this.yield();
//            }
        }
    }

    public ThreadMethod(String name){
        super(name);
    }

}

public class ThreadMethodTest {

    public static void main(String[] args) {
        // ThreadTest1 t1 = new ThreadTest1();
        // 设置线程名称
       // t1.setName("线程1");
       // 构造器设置名称
        ThreadMethod t1 = new ThreadMethod("线程一");
       //设置优先级
       t1.setPriority(Thread.MAX_PRIORITY);
       t1.start();
       Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
       Thread.currentThread().setName("主线程");
       for (int i = 0; i <100 ; i++) {
            if (i%2 ==0){
                System.out.println(Thread.currentThread().getName()+":"+Thread.currentThread().getPriority()+":"+i);
            }
//            if (i==20){
//                try {
//                    //7、join()
//                    t1.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
       }
       //10、判断此线程是否存活。
       //System.out.println(t1.isAlive());

    }
}
