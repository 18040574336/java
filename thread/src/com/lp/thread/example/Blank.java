package com.lp.thread.example;

class Account{
	private  Double blance ;


	public Account(Double blance) {
		this.blance = blance;
	}

	public  synchronized  void doAddMoney(double money){
         if(money>0){
	         blance  +=money;
         }
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"存钱成功，余额："+ blance);
	}
}

class  Customer  extends  Thread{

	private Account account;

	public Customer(Account account){
		this.account = account;
	}

	@Override
	public void run() {
		for (int i = 0;i<3;i++){
			account.doAddMoney(1000);


		}
	}
}


public class Blank {

	public static void main(String[] args) {
		Account account = new Account(0d);
		Customer c1 = new Customer(account);
		Customer c2 = new Customer(account);

		c1.setName("甲");
		c2.setName("乙");

		c1.start();
		c2.start();
	}
}
