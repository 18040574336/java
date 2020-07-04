package com.lp.date;

import org.junit.Test;

import java.util.Date;

/**
 * JDK 8 之前日期和时间的API测试
 *
 * java.util.Date 类
 *       |-- java.sql.Date 类
 *
 *  1、两个构造器使用
 *    >构造器一：Date(): 创建一个对应当前时间的Date对象
 *    >构造器二：创建指定毫秒数的Date对象。
 *  2、两个方法的使用
 *    >toString():显示年、月、日、时、分、秒
 *    >getTime():获取当前Date对象对应的毫秒数(时间戳)
 *  3、java.sql.Date 对应着数据库中的日期类型的变量
 *    >如何实例化
 *    >如何将java.util.Date对象装换成java.sql.Date对象
 *
 *
 */

public class DateTest {

	@Test
	public  void DateTimeTestmain(){

		//存在偏移量，year+1900,month+1
		Date date = new Date(2020,1,4);
		System.out.println(date);  //Wed Feb 04 00:00:00 CST 3920

		Date date1 = new Date(2020-1900,1-1,4);
		System.out.println(date1); //Sat Jan 04 00:00:00 CST 2020

	}


	@Test
	public void test1(){
		// 1、System类中的currentTimeMillis,返回1970年1月1日0时0分0秒的时间差，单位毫秒
		long l = System.currentTimeMillis();
		//称为时间戳
		System.out.println(l);
	}

	@Test
	public void test2(){
        //构造器一：Date(): 创建一个对应当前时间的Date对象
		Date date1 = new Date();
		System.out.println(date1); //Mon Jun 15 22:47:57 CST 2020

		System.out.println(date1.getTime());  //1592232553048

		//构造器二：创建指定毫秒数的Date对象。
		Date date2 = new Date(1592232553048L);
		System.out.println(date2.toString());

		//创建java.sql.Date对象
		java.sql.Date date3 = new java.sql.Date(1592232553048L);
		System.out.println(date3);  //2020-06-15

        //如何将java.util.Date对象装换为java.sql.Date
		Date date4 = new Date();
		java.sql.Date date5 = new java.sql.Date(date4.getTime());
		System.out.println(date5);


	}
}
