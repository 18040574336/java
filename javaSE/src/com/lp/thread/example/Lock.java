package com.lp.thread.example;

import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * Lock锁解决线程安全问题
 * ReentrantLock
 *
 *
 * Lock手动开始和关闭，性能更好，灵活
 *
 */

class WindowLock implements  Runnable{
    private int ticket=100;
    private ReentrantLock lock = new ReentrantLock(true);
	@Override
	public void run() {
		while (true){
			try {
				lock.lock();
				if (ticket>0){
					System.out.println(Thread.currentThread().getName()+":"+ticket);
					ticket--;
				}else {
					break;
				}
			}finally {
				lock.unlock();
			}



		}

	}
}

public class Lock {

	public static void main(String[] args) {
		WindowLock w = new WindowLock();
		Thread t1 = new Thread(w);
		Thread t2 = new Thread(w);
		Thread t3 = new Thread(w);

		t1.setName("窗口一");
		t2.setName("窗口二");
		t3.setName("窗口三");

		t1.start();
		t2.start();
		t3.start();

	}
}
