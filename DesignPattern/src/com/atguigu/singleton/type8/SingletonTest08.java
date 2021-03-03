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

//ʹ��ö�٣�����ʵ�ֵ���, �Ƽ�
enum Singleton {
	INSTANCE; //����
	public void sayOK() {
		System.out.println("ok~");
	}
}