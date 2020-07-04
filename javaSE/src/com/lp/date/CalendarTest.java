package com.lp.date;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

	public static void main(String[] args) {
		//获取日历类
		Calendar instance = Calendar.getInstance();
		System.out.println(instance.getClass());
		//get  获取在这个月的第几天
		int i = instance.get(Calendar.DAY_OF_MONTH);
		System.out.println(i);
		//set 设置日期
		instance.set(Calendar.DAY_OF_MONTH,1);
		//add 增加4天（-4）是减少
		instance.add(Calendar.DAY_OF_MONTH, 4);
		//getTime 获取date
		Date time = instance.getTime();
		//setTime 设置date
		instance.setTime(new Date());
	}

}
