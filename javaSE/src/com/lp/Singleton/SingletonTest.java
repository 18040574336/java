package com.lp.Singleton;

/**
 *
 *
 *
 */
public class SingletonTest {

	public static void main(String[] args) {

	}
}


/**
 *
 * 饿汉式
 *
 */
class SingletonHungry {

	private static SingletonHungry singleton = new SingletonHungry();
	private SingletonHungry(){}

	public static SingletonHungry getInstance(){
		return  singleton;
	}

}

/***
 *
 *  懒汉式 (存在线程安全)
 *
 */
class SingletonLazy{

	private static SingletonLazy singleton = null;

	private SingletonLazy(){}

	public  static SingletonLazy getInstance(){
        if (singleton == null){
	        singleton = new SingletonLazy();
        }
		return  singleton;
	}

}

/***
 *
 *  同步方法，效率低
 *
 */
class SingletonSyn{

	private static  volatile SingletonSyn singleton = null;
	private SingletonSyn(){}

	public synchronized  static SingletonSyn getInstance(){
		if (singleton == null){
			singleton = new SingletonSyn();
		}
		return  singleton;
	}

}


/***
 *
 *  双重检查锁
 *
 */
class SingletonDoubleCheck{

	private static  volatile SingletonDoubleCheck singleton = null;
	private SingletonDoubleCheck(){}

	public  static SingletonDoubleCheck getInstance(){
		if (singleton == null){
			synchronized (SingletonDoubleCheck.class){
                if (singleton == null){
	                singleton = new SingletonDoubleCheck();
                }
			}
		}
		return  singleton;
	}

}

/**
 *
 * 静态内部类
 */
class SingletonInner{

	private  static class Holder {
		private static SingletonInner singleton = new SingletonInner();
	}

	private SingletonInner (){};

	public  static SingletonInner getInstance(){
		return Holder.singleton;
	}

}

