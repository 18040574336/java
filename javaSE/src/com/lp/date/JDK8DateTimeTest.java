package com.lp.date;

import org.junit.Test;

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

}
