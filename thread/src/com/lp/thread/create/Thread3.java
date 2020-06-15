package com.lp.thread.create;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 创建线程方式三、实现Callable接口 -- JDK 5.0 新增特性
 *
 *1、创建一个实现Callable的实现类。
 *
 *
 * 如何理解实现Callable接口的方式创建多线程比实现Runable接口创建多线程方式强大
 * 1、call()可以有返回值。
 * 2、call()可以抛异常，被外面的操作捕获，获取异常的信息。
 * 3、Callable支持泛型
 *
 */

class Thread3Test implements Callable<Integer>{

    //实现call方法，将此线程需要执行的操作声明在call()中。
	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for (int i = 0;i<=100;i++){
			if (i%2==0){
				sum+=i;
				System.out.println(sum);
			}
		}
		return sum;
	}
}


public class Thread3 {

	public static void main(String[] args) {
		//3、创建Callable接口实现类对象。
		Thread3Test thread3Test = new Thread3Test();
		//4、将此Callable接口实现类的对象作为传递到FutureTask构造器中，创建FutureTask对象。
		FutureTask<Integer> futureTask = new FutureTask<Integer>(thread3Test);
		//5、将FutureTask的对象作为参数传递到Thread类中的构造器中，创建Thread对象，并调用start()
		new Thread(futureTask).start();

		try {
            //6、获取Callable中call方法的返回值
			//get()返回值即为FutureTask构造器参数Callable实现类重写的call()的返回值。
			Integer object = futureTask.get();
			System.out.println("总和是:"+object);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}
