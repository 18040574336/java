package com.lp.thread.example;


/**
 *
 * 死锁
 */
public class DeadLock {

	public static void main(String[] args) {
		StringBuffer b1 = new StringBuffer();
		StringBuffer b2 = new StringBuffer();


		new Thread(){
			@Override
			public void run() {
				synchronized (b1){
					b1.append("a");
					b2.append("1");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (b2){
						b1.append("b");
						b2.append("2");
						System.out.println(b1);
						System.out.println(b2);
					}
				}



			}
		}.start();


		new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (b2){
					b1.append("c");
					b2.append("3");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (b1){
						b1.append("d");
						b2.append("4");
						System.out.println(b1);
						System.out.println(b2);
					}
				}


			}
		}).start();



	}
}
