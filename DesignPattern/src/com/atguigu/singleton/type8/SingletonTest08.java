package com.atguigu.singleton.type8;

import java.math.BigDecimal;

public class SingletonTest08 {
	public static void main(String[] args) {

		System.out.println(BigDecimal.ONE);
		String p  = "3319DPPKC-B7T018-X";
		System.out.println(p.substring(0, p.length()-2));


		Singleton instance = Singleton.INSTANCE;
		Singleton instance2 = Singleton.INSTANCE;
		System.out.println(instance == instance2);
		
		System.out.println(instance.hashCode());
		System.out.println(instance2.hashCode());
		
		instance.sayOK();
	}
}

//使用枚举，可以实现单例, 推荐
enum Singleton {
	INSTANCE; //属性
	public void sayOK() {
		System.out.println("ok~");
	}
}