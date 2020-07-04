package com.lp.thread.example;

import sun.security.jca.GetInstance;


class SingletonTest {

	private SingletonTest() {}
	private static SingletonTest singletonTest = null;

	public static SingletonTest getInstance() {
		if (singletonTest == null){
			synchronized (SingletonTest.class){
				if (singletonTest == null) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					singletonTest = new SingletonTest();
				}
			}
		}

		return singletonTest;

	}
}


public class Singleton {


	public static void main(String[] args) {

		 new Thread() {
			@Override
			public void run() {
				Thread.currentThread().setName("线程一");
				System.out.println(Thread.currentThread().getName()+"=="+SingletonTest.getInstance());
			}
		 }.start();


		new Thread() {
			@Override
			public void run() {
				Thread.currentThread().setName("线程二");
				System.out.println(Thread.currentThread().getName()+"=="+SingletonTest.getInstance());

			}
		}.start();

//		SingletonTest a = SingletonTest.getInstance();
//		SingletonTest b = SingletonTest.getInstance();
//		System.out.println(a==b);
	}
}


