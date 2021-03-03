package com.lp.date;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

public class DateTimeFormatterTest {


	/**
	 *
	 * DateTimeFormatter
	 *
	 * 类似于SimpleDateFormat
	 */
	@Test
	public void Test1(){

		//方式一:预定义的标准格式。如ISO_LOCAL_DATE,ISO_LOCAL_TIME,ISO_LOCAL_DATE_TIME
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
		LocalDateTime localDateTime = LocalDateTime.now();
		//格式化：日期->字符串
		String format = dateTimeFormatter.format(localDateTime);
		System.out.println(format); //2020-07-05
		//解析：字符串->日期
		TemporalAccessor parse = dateTimeFormatter.parse("2020-07-05");
		System.out.println(parse);

		//方式二:
		// 本地化相关的格式。如ofLocalizedDateTime()
		//FormatStyle.Long,FormatStyle.MEDIUM,FormatStyle.SHORT;适用LocalDateTime
		DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
		//格式化
		String format1 = dateTimeFormatter1.format(localDateTime);
		System.out.println(format1);  //2020年7月5日 下午09时21分27秒

		//本地化相关的格式：如ofLocalizedDate()
		//FormatStyle.FULL,FormatStyle.Long,FormatStyle.MEDIUM,FormatStyle.SHORT;适用LocalDate
		DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		//格式化
		String format2 = dateTimeFormatter2.format(LocalDate.now());
		System.out.println(format2); //2020年7月5日 星期日


		//方式三(重点)：自定义的格式。如ofPattern()
		DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String format3 = dateTimeFormatter3.format(localDateTime);
		System.out.println(format3); //2020-07-05 21:29:15


	}
}
