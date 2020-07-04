package com.lp.string;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringCharByte {
	/**
	 *
	 * String ----> char[]
	 *
	 * char[] ---->String
	 */
	@Test
	public void  Test(){
		String str =  "abcdef";
		char[] chars = str.toCharArray();
		System.out.println(chars);

		String str1 = String.valueOf(chars);
		System.out.println(str1);
	}


	/**
	 *  编码：String--->byte[]:调用String的getBytes()
	 *  解码：byte[]---->String
	 *
	 *  编码: 字符串---> 字节 (看得懂---> 看不懂的二进制数据)
	 *  解码: 编码的逆过程,字节->字符串(看不懂的二进制数据-->看得懂)
	 *
	 *
	 * @throws UnsupportedEncodingException
	 */
	@Test
	public void Test1() throws UnsupportedEncodingException {
		String str = "abcdefg中国";
		byte[] bytes = str.getBytes(); //使用默认字符集编码
		System.out.println(Arrays.toString(bytes));
		byte[] gbks = str.getBytes("gbk");
		String str1 = new String(gbks,"gbk");
		System.out.println(str1);
		str1.intern();
		//乱码：编码集和解码集不一致
		String str2 = new String(gbks);
		System.out.println(str2);


	}

}
