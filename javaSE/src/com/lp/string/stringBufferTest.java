package com.lp.string;


import org.junit.Test;

/**
 *
 * 字符串 “abcdefgh” 反转“agfedcbh”
 *
 *
 */
public class StringBufferTest {

	private static String reverse(String str,int start,int end ){
		char[] chars = str.toCharArray();

		if (str != null){
			for (int x = start,y = end;x<y;x++,y--){
				char temp = chars[x];
				chars[x] = chars[y];
				chars[y] = temp;
			}
		}
		return new String(chars);
	}


	private static String reverse1(String str,int start,int end){
		StringBuffer result = new StringBuffer();
		StringBuffer buf = new StringBuffer(str.substring(start, end+1));
		StringBuffer reverse = buf.reverse();
		result.append(str.substring(0, start)).append(reverse).append(str.substring(end+1, str.length()));
		return result.toString();
	}

	public static void main(String[] args) {
		String str = "abcdefgh";
		//方式一
		String reverse = reverse(str, 1, 6);
		System.out.println(reverse);
		//方式二
		String reverse1 = reverse1(str, 1, 6);
		System.out.println(reverse1);
	}


	/**
	 *
	 *  String str1 = "abhellocd";
	 *  String str2 = "ahellod";
	 *
	 *  取相同最大字符串
	 *
	 */
	@Test
	public void test1(){
		String str1 = "abhellocd";
		String str2 = "ahellod";
		String maxSameString = "";
		boolean flag = true;
		int length = str2.length();
		for (int i = 0 ;i<length && flag ; i ++){
			for (int x =0,y= length-i;y<=length;x++,y++){
				String substring = str2.substring(x, y);
				if (str1.contains(substring)){
					maxSameString = substring;
					flag =false;
					break;
				}
			}
		}

		System.out.println(maxSameString);

	}


}
