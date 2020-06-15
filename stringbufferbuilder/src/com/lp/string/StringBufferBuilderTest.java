package com.lp.string;


import java.util.Arrays;
import java.util.List;

/**
 * 关于StringBuffer和StringBuilder的使用
 *
 * String、StringBuffer、StringBuilder区别
 * String：不可变的字符序列;  底层 char[] 存储
 * StringBuffer:可变的字符序列：线程安全(效率低)JDK1.0; 底层 char[] 存储
 * StringBuilder:可变的字符序列：线程不安全 (效率高) JDK5.0;底层 char[] 存储
 *
 *
 * 源码分析：
 * String str = new Sting(); // Char[] value = new char[0];
 * String str1 = new String("abc"); // Char[] value = new char[]{'a','b','c'};
 *
 * StringBuffer strBuffer1 = new StringBuffer(); // Char[] value = new Char[16]; 底层默认创建一个长度16的数组。
 * strBuffer1.append("a"); //char[0] = a;
 * strBuffer1.append("b"); //char[1] = b;
 *
 * StringBuffer strBuffer2 = new StringBuffer("abc"); // Char[] value = new Char["abc".length+16];
 *
 * 问题：超过16长度
 * 扩容：为原来的2倍+2，并且将原来数组中的元素复制到新的数组中，如果超过扩容数据，会将存储的字符长度作为新的长度
 *
 * 开发中注意：建议使用StringBuffer(int capacity) 或 StringBuilder(int capacity)构造器，避免扩容，扩容会影响性能。
 *
 *
 */
public class StringBufferBuilderTest {

	/***
	 *
	 * StringBuffer 常用方法：
	 * 1、append(xxx):提供了很多的append()方法，用于进行字符串拼接。
	 * 2、delete(int start,int end):删除指定位置的内容
	 * 3、replace(int start,int end,String str):把[start,end)位置替换str
	 * 4、insert(int offset,xxx):在指定位置插入xxx
	 * 5、reverse():把当前字符串系列逆转。
	 * 6、int indexOf(String str)
	 * 7、String subString(int start,int end):返回一个从start开始到end索引结束的左闭右开的字符串。
	 * 8、int length()
	 * 9、Char charAt(n)
	 * 10、void setCharAt(int n,Char ch)
	 *
	 *
	 * 总结 ：
	 *   增：append(xxx)
	 *   删：delete(int start,int end)
	 *   改：setCharAt(int n,Char ch)/ replace(int start,int end,String str)
	 *   查：charAt(int n)
	 *   插入：insert(int offset,xxx)
	 *
	 */

	public static void main(String[] args) {
	}
}
