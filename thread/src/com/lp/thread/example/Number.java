package com.lp.thread.example;


/***
 * 线程通信的例子：使用两个线程打印1-100，线程1，线程2，交替打印
 *
 *
 *  涉及三个方法：
 *  1、wait()：一旦执行此方法，当前线程就进入阻塞状态，并释放同步监视器（锁）。
 *  2、notify(): 一旦执行此方法，就会唤醒被wait的一个线程，如果有多个wait，就按优先级来。
 *  3、notifyAll()：一旦执行此方法，将唤醒多有wait线程。
 *
 *  说明：
 * 1、wait()，notify()，notifyAll() 三个方法必须使用在同步代码块或同步方法中。
 * 2、wait()，notify()，notifyAll() 三个方法的调用者必须和同步代码块或同步方法中的同步监视器（锁）。
 *    否则：会出现异常 java.lang.IllegalMonitorStateException
 * 3、wait()，notify()，notifyAll()是java.lang.Object类中的方法。
 *
 *
 * 面试题：sleep()和wait()区别
 *1、相同点：一旦执行此方法，都可以使当前线程进入阻塞状态。
 *2、不同点：
 *       1)两个方法声明的位置不同:Thread类中声明sleep()，Object类中声明wait()
 *       2)调用方法不同：sleep()如何需要的地方都可以调用，wait()必须使用在同步代码块或同步方法中，必须使用相同锁。
 *       3)关于释放锁：sleep()不会释放，wait()会释放。
 *
 *
 *
 *
 */
class NumberTest implements  Runnable{
    private  int count = 1;
	@Override
	public void run() {
		while(true){
			synchronized (this){
				notify();
				if (count<=100){
					System.out.println(Thread.currentThread().getName()+":"+count);
					count++;
				} else {
					break;
				}
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}
	}
}


public class Number {

	public static void main(String[] args) {
		NumberTest n = new NumberTest();
		Thread   t = new Thread(n);
		Thread   t1 = new Thread(n);
        t.setName("甲");
        t1.setName("乙");
		t.start();
		t1.start();
	}


}
