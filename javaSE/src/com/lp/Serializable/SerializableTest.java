package com.lp.Serializable;

import com.lp.Serializable.java.Person;
import org.junit.Test;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.System.out;

public  class SerializableTest {

	@Test
	public void test(){
		ObjectOutputStream out = null ;
		try {
			out = new ObjectOutputStream(new FileOutputStream("1.dat"));
			out.writeObject(new Person("zhangsan", 23));
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (out != null){
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}




	}

	@Test
	public  void testOjbectInputStream(){
		ObjectInputStream in = null ;
		try {
			in = new ObjectInputStream(new FileInputStream("1.dat"));
			Person person = (Person)in.readObject();
			out.println(person);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (in != null){
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}




	}
	public static void main(String[] args) {
		Integer a =1;
		Integer b =2;
		Integer c =null;
		Boolean flag =false;
// a*b的结果是int类型，那么c会强制拆箱成int类型，抛出NPE异常
		Integer result=(flag?a*b :c);

		String[] str = new String[] { "yang", "hao" };
		List list = Arrays.asList(str);
		//list.add("yangguanbao");// 运行时异常。
		str[0]= "changed";// 也会随之修改，反之亦然。


		String orgFullPath = "foton/福田汽车集团/SBU/雷萨重机事业部/技术研究院/起重机产品所";
		List<String> collect = Stream.of(orgFullPath.split("/")).collect(Collectors.toList());

		List<String> orgList = Stream.of(orgFullPath.split("/")).collect(Collectors.toList());
		Optional<String> companyOptional = orgList.stream().filter(p -> p.endsWith("事业部")).findFirst();
		boolean present = companyOptional.isPresent();
		if (present){
			out.println(companyOptional.get());
		}

    }
}
