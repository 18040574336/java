package com.lp.date;

import org.junit.Test;

import java.time.*;
import java.util.Date;

/***
 *
 * JDK1.0 中包含了java.util.Date类，但是他的大多数方法已经在
 * JDK1.1 Z中引入Calendar类之后被弃用了。
 * 而Calendar并不比Date好多少，他们面临的问题是：
 *
 * 1)可变性：像日期和时间这样的类应该是不可变的。
 * 	//set 设置日期
 * 	instance.set(Calendar.DAY_OF_MONTH,1);
 *
 * 2）偏移性：Date中的年份是从1900开始的，而月份都从0开始。
 * 	 //存在偏移量，year+1900,month+1
 *      Date date = new Date(2020,1,4);
 * 		System.out.println(date);  //Wed Feb 04 00:00:00 CST 3920
 *
 * 		Date date1 = new Date(2020-1900,1-1,4);
 * 		System.out.println(date1); //Sat Jan 04 00:00:00 CST 2020
 *
 * 3） 格式化：格式化只对Date有用，Calendar则不行。
 *
 *
 * 4）线程不安全的，不能处理闰秒。
 *
 *
 *
 *
 *
 *
 *
 */

public class JDK8DateTimeTest {

	@Test
	public  void JDK8DateTimeTestmain(){
		//存在偏移量，year+1900,month+1
        Date date = new Date(2020,1,4);
		System.out.println(date);  //Wed Feb 04 00:00:00 CST 3920

		Date date1 = new Date(2020-1900,1-1,4);
		System.out.println(date1); //Sat Jan 04 00:00:00 CST 2020
	}

	 @Test
	 public void test1(){
		//now() 获取日期、时间、日期+时间
		 LocalDate now = LocalDate.now();
		 LocalTime now1 = LocalTime.now();
		 LocalDateTime now2 = LocalDateTime.now();
		 System.out.println(now);
		 System.out.println(now1);
		 System.out.println(now2);

		 //of() 设置年月日时分秒，没有偏移量
		 LocalDateTime of = LocalDateTime.of(2020, 7, 4, 22, 23);
		 System.out.println(of);


		 //getXXX()：获取相关属性  月份没有偏移，1就是1月
		 System.out.println(now2.getDayOfMonth());
		 System.out.println(now2.getMonth());
		 System.out.println(now2.getMonthValue());
		 System.out.println(now2.getMinute());

		 //withXXX():设置相关属性
		 LocalDateTime localDateTime1 = now2.withDayOfMonth(22);
		 System.out.println(now2); //体现出不可变性
		 System.out.println(localDateTime1);
		 System.out.println(now.withMonth(4));

		 //plusxxx(): 增加
		 LocalDateTime a = now2.plusMonths(3);
		 System.out.println(now2);
		 System.out.println(a);

		 //minusxxx():减少
		 LocalDateTime localDateTime = now2.minusMonths(4);
		 System.out.println(now2);
		 System.out.println(localDateTime);
	 }


	/**
	 * Instant 实例
	 *
	 * 类似于 java.util.Date
	 *
	 */

	@Test
	 public void test2(){
		 //now():获取本初子午线对应的标准时间
		 //我们所在东八区，相差8个小时
		 Instant instant = Instant.now();
		 System.out.println(instant);

		 //添加时间偏移量
		 OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
		 System.out.println(offsetDateTime);

		 //toEpochMilli():获取自1970年1月1日0时0分0秒(UTC)开始的毫秒数-->Date(Long millis)
		 long milli = instant.toEpochMilli();
		 System.out.println(milli);

	     //ofEpochMilli():通过给定的毫秒数，获取Instant实例-->Date(Long millis)
		 Instant instant1 = Instant.ofEpochMilli(1593872253814L);
		 System.out.println(instant1);

	 }

	 

}
