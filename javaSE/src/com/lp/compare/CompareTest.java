package com.lp.compare;


import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 *一、说明：java中的对象，正常情况下，只能进行比较 == 或！= 。不能使用>或<的
 *         但是在开发场景中，我们需要对多个对象进行排序,言外之意,就需要比较对象大小。
 *         如何实现？使用两个接口中的任何一个：Comparable 或 Comparator
 *
 * 二、Comparable接口与Comparator的使用的对比：
 *    Comparable接口的方式一旦一定，保证Comparable接口实现类的对象在任何位置都可以比较大小。
 *    Comparator接口属于临时性。
 *
 *
 *
 */
public class CompareTest {

	/**
	 *Comparable接口的使用举例：
	 *1、像Stirng、包装类等实现了Comparable接口，重写了compareTo(obj)方法,给出了比较两个对象大小的实现方式
	 *2、像String、包装类重写compareTo(obj)方法以后,进行了从小到大的排列
	 *3、重写compareTo(obj)的规则：
	 *   如果当前对象this大于形参对象obj,则返回正整数。
	 *   如果当前对象this小于形参对象obj,则返回负整数。
	 *   如果当前对象this等于形参对象obj,则返回零。
	 *4、对于自定义类来说，如果需要排序，我们可以让自定义类实现Comparable接口,重写compartTo()方法
	 *   在compareTo(obj)方法中指明如何排序。
	 */

	@Test
	public void test(){
		String[] arr = new String[]{"AA","DD","CC","BB"};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

	}


	/**
	 *
	 * 自然排序
	 * 实现接口Comparable
	 */
	@Test
	public void exampleTest(){
		Goods g = new Goods();
		Goods[] arr = new Goods[3];
        arr[0] = new Goods("zhangsan",  12);
        arr[1] = new Goods("lishi", 23);
        arr[2] = new Goods("zhaoliu", 14);
        Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	/**
	 *
	 *Comparator接口的使用:定制排序
	 *1、背景：
	 * 当元素的类型没有实现java.lang.Comparable接口而又不方便修改代码
	 * 后者实现了Comparable接口的排序规则不适合当前的操作，
	 * 那么可以考虑使用Comparator的对象来排序
	 *2、重写compare(Object o1,Object o2)方法，比较o1和o2的大小：
	 *  如果返回正整数，则标识o1大于o2：
	 *  如果返回0，表示相等：
	 *  返回负整数，表示o1小于o2。
	 *
	 *VEHICLE_CODE
	 */
	@Test
	public void tes1(){
		Goods g = new Goods();
		Goods[] arr = new Goods[3];
		arr[0] = new Goods("zhangsan",  12);
		arr[1] = new Goods("lishi", 23);
		arr[2] = new Goods("zhaoliu", 14);
		Arrays.sort(arr, new Comparator<Goods>() {
			@Override
			public int compare(Goods o1, Goods o2) {
				return -Double.compare(o1.getPrice(),o2.getPrice());
			}
		});
		System.out.println(Arrays.toString(arr));

	}
}
