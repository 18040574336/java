package com.lp.string;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;
public class StringMethodTest {
	@Test
	public void test1(){
    //1) int length():返回字符串长度：return value.length
		String s1 = "helloworld";
		System.out.println(s1.length());

	//2)char charAt(int index):返回某索引处的字符return value[index]
		char c1 = s1.charAt(2);
		System.out.println(c1);

	//3)boolean isEmpty: 判断是否是空字符串：return value.length==0
		String str2 = "";
		System.out.println(str2.isEmpty());

	//4)toLowerCase() toUpperCase():使用默认语言环境：转化大小写
	    String str3 = "helloworld";
	    String str4 = "HELLOWORLD";
		System.out.println(str3.toUpperCase());
		System.out.println(str4.toLowerCase());

	//5)trim(): 返回字符串的副本：忽略前导空白和尾部空白。
		String trim = "   helloword    ";
		System.out.println(trim);
		System.out.println(trim.trim());

	//6)boolean equals(Object obj):比较字符串的内容是否相同
		// boolean equalsIgnoreCase(String anotherString):忽略大小写
		String equals1 = "helloworld";
		String equals2 = "HelloWorld";
		System.out.println(equals1.equals(equals2));
		System.out.println(equals1.equalsIgnoreCase(equals2));

	//7)concat(String str):将指定字符串连接到此字符串的结尾，等价于"+"
        String concat = "abc";
		System.out.println(concat.concat("def"));

	//8)int compareTo(String anotherstring): 比较两个字符串大小
		String compareC1 = "abc";
		String compareC2 = "abe";
		System.out.println(compareC1.compareTo(compareC2));

	//9)String substring(int beginIndex):返回一个新的字符串，他是从beginIndex开始截取，包含beginIndex
        String sub = "01234567";
		System.out.println(sub.substring(2));

	//10)String substring(int beginIndex,int endIndex):返回一个字符串，包前不包后[ )
		System.out.println(sub.substring(2,5));
	}

	@Test
	public void test2(){
	//1) boolean endsWith(String suffix):测试字符串是否以指定字符串结尾
		String endsWithstr =  "helloworld";
		System.out.println(endsWithstr.endsWith("ld"));

	//2) boolean startsWith(String prefix):测试字符串是否以指定的前缀开始
		String startsWithstr = "hellworld";
		System.out.println(startsWithstr.startsWith("hel"));

	//3) boolean startsWith(String prefix,int toffset):测试字符串从指定索引开始的子字符串是否包含
		System.out.println(startsWithstr.startsWith("ll",2));

	//4) boolean contains(CharSequence s ):当且仅当此字符串中包含指定char值序列时，返回true；
		String containsstr = "helloworld";
		System.out.println(containsstr.contains("e"));

	//5)int indexOf(String str):返回指定字符串在此字符串中第一次出现的索引
		System.out.println(containsstr.indexOf("o"));
	//6) index indexOf(String str,int fromIndex):回指定字符串在此字符串中第一次出现的索引,从fromIndex开始
		String indexOfString = "helloworldhelloworld";
		System.out.println(indexOfString.indexOf("ll",5));

	//7) index lastIndexOf(String str)：返回指定字符串在此字符串右边出现的索引
		String lastindexOfString = "helloworldhelloworld";
		System.out.println(lastindexOfString.lastIndexOf("ld"));

	//8) index lastIndexOf(String str,int fromindex)：返回指定字符串在此字符串右边出现的索引,
		// 从fromindex反向查找，从右向左，与indexof正好相反
		System.out.println(lastindexOfString.lastIndexOf("ld",7));
	}

    @Test
	public void test3(){
	//1) String replace(char oldChar,char newChar):返回一个新的字符串，它是通过newChar替换此字符串中出现的所有oldChar得到的。
	    String string = "我爱北京天安门，天安门！";
	    String replaceChar= string.replace('天', '大');
	    System.out.println(replaceChar);

	//2) String replace(CharSequence target,CharSequence replacement):使用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串。
	    String replaceString= string.replace("天安门","故宫");
	    System.out.println(replaceString);

	//3) String replaceAll(String regex，String replacement):使用给定的replacement替换此字符串所有匹配给定的正则表达式的子字符串。
	    String regex = "12hello34word56java";
	    //把数字(多个)替换成, (\d 是数字 + 是多个)
	    String regexString = regex.replaceAll("\\d+", ",");
	    //^(开头),|(或),$(结尾)
	    String s = regexString.replaceAll("^,|,$", "");
	    System.out.println(regexString);
	    System.out.println(s);

	//4) String replaceFrist(String regex,String replacement):使用给定的replacement替换此字符串匹配给定的正则表达式的第一个子字符串。
	    String s1 = regex.replaceFirst("\\d+", ",");
	    System.out.println(s1);

	//5) boolean matches(String regex): 告知此字符串是否匹配给定的正则表达式。
        String str = "123456";
        //判断str字符串是否全部由数字组成，即1-n个数字组成。
	    boolean matches = str.matches("\\d+");
	    System.out.println(matches);
	    String telphone = "027-69540045";
	    boolean matches1 = telphone.matches("027-\\d{7,8}");
	    System.out.println(matches1);

	//6) String[] split(String regex):根据给定正则表达式匹配拆分此字符串。
	    str = "hello|world|java|";
	    String[] split = str.split("\\|");
	    for (String a :split){
		    System.out.println(a);
	    }
	    str = "hello.world.java.";
	    String[] splits = str.split("\\.");
	    for (String a :splits){
		    System.out.println(a);
	    }

	//7) String[] split(String regex,int limit):根据匹配给定的正则表达式来拆分此字符串，最多不超过limit个，如果超过了全部放到最后一个元素中。
	    str = "hello.world.java.mysql.";
	    String[] splits1 = str.split("\\.",3);
	    for (String a :splits1){
		    System.out.println(a);
	    }

	}


}
