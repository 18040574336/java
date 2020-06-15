package com.lp.thread.example;

import com.oracle.jrockit.jfr.Producer;
import com.sun.javafx.logging.PulseLogger;

import java.security.PublicKey;

/***
 * 生产者，消费者，店员
 * 产品<20，生产者生产，否则等待
 * 产品<0，消费者等待
 * 
 */

class Clerk{
	
	private int  productCount =  0;


	public synchronized  void createProduct() {
			if (productCount<20){
				productCount++;
				notify();

				System.out.println(Thread.currentThread().getName()+"生产第"+productCount+"个产品");
			} else{
				System.out.println("生产者wait");

				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
	}

	public synchronized   void buyProduct() {
			if (productCount>0){
				System.out.println(Thread.currentThread().getName()+"消费第"+productCount+"个产品");
				productCount--;
				notify();
			} else{
				System.out.println("消费者wait");
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
	}
}

class  Poducer extends  Thread{
	
	private Clerk clerk;
	
	public Poducer( Clerk clerk){
		this.clerk = clerk;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			clerk.createProduct();
		}
	}
}

class  Custtomer extends  Thread{

	private Clerk clerk;

	public Custtomer( Clerk clerk){
		this.clerk = clerk;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			clerk.buyProduct();
		}
	}
}

public class ProducerTest {

	public static void main(String[] args) {
		Clerk c = new Clerk();
		Poducer p = new Poducer(c);
		Custtomer p1 = new Custtomer(c);
		Custtomer p2 = new Custtomer(c);

		p.setName("生产者：");
		p1.setName("消费者1：");
		p2.setName("消费者2：");

		p.start();
		p1.start();
		p2.start();

	}


}
