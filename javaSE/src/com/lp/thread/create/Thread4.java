package com.lp.thread.create;

import java.util.concurrent.*;

/***
 * 创建线程方式4：线程池
 * 背景：
 *     经常创建和销毁、使用量特别大的资源，比如并发情况下的线程，对性能影响很大。
 *
 * 思路：
 *     提前创建好多个线程，放入线程池中，使用是直接获取，使用完放回池中。可以避免
 * 频繁创建销毁、实现重复利用。
 *
 *
 * 好处：
 * 1、提高响应速度(减少了创建新线程的时间)。
 * 2、降低资源消耗(重复利用线程池中线程，不需要每次创建)
 * 3、便于管理
 *    corePoolSize：核心池大小
 *    maximumPoolSize：最大线程数
 *    keepAliveTime：线程没有任务时最多保持多长时间后会终止。
 *
 *
 *
 *
 *
 *
 */

class Thread4Test implements  Runnable{

	@Override
	public void run() {
		for (int i = 0;i<=100;i++){
			if (i%2!=0){
				System.out.println(Thread.currentThread().getName()+"："+i);
			}
		}	}
}

class Thread4Test1 implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		for (int i = 0;i<=100;i++){
			if (i%2==0){
				System.out.println(Thread.currentThread().getName()+"："+i);
			}
		}
		return 1;
	}
}

public class Thread4 {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		System.out.println(executorService.getClass()); //class java.util.concurrent.ThreadPoolExecutor
		//设置线程池属性
		ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
		threadPoolExecutor.setCorePoolSize(100);

		threadPoolExecutor.execute(new Thread4Test()); //使用与实现Runnable
		threadPoolExecutor.submit(new Thread4Test1());//适用于实现Callable
		threadPoolExecutor.shutdown(); //关闭连接池
	}
}
