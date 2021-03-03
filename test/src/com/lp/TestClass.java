package com.lp;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;

import java.awt.print.PrinterAbortException;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestClass {

	protected ThreadLocal<Map<String, Object>> changeData = new ThreadLocal<>();
	public  int a = 0;

    private class InnerClass{

    	public InnerClass(){
		    int a = TestClass.this.a;
	    }

    }

	@Test
	public void test12(){
    	Integer v1= 3;
    	Integer v2= 1;
    	Boolean bb= v1>v2;
		System.out.println(bb);

		// sum: 是每次累计计算的结果，b是Function的结果
		System.out.println(Stream.of(1, 3, 4).collect(Collectors.reducing(0, x -> x + 1, (sum, b) -> {
			System.out.println(sum + "-" + b);
			return sum + b;
		})));


		// 下面代码是对reducing函数功能实现的描述，用于理解reducing的功能
		int sum = 0;
		List<Integer> list3 = Arrays.asList(1, 3, 4);
		for (Integer item : list3) {
			int b = item + 1;
			System.out.println(sum + "-" + b);
			sum = sum + b;
		}
		System.out.println(sum);


	}


	@Test
	public void testGroupBy(){
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		// 奇偶数分组：奇数分一组，偶数分一组
		// groupingBy(Function<? super T, ? extends K> classifier) 参数是Function类型，Function返回值可以是要分组的条件，也可以是要分组的字段
		// 返回的结果是Map，其中key的数据类型为Function体中计算类型，value是List<T>类型，为分组的结果
		Map<Boolean, List<Integer>> result = list.stream().collect(Collectors.groupingBy(item -> item % 2 == 0));
		// {false=[1, 3, 5, 7, 9], true=[2, 4, 6, 8, 10]}
		System.out.println(result);


		// partitioningBy 用于分成两组的情况
		Map<Boolean, List<Integer>> twoPartiton = list.stream().collect(Collectors.partitioningBy(item -> item % 2 == 0));
		System.out.println(twoPartiton);

	}



	@Test
	public void test2(){
		System.out.println(Stream.of(1, 3, 4).collect(Collectors.reducing(0, x -> x + 1, (sum, b) -> {
			System.out.println(sum + "-" + b);
			return sum + b;
		})));

		// sum: 是每次累计计算的结果，b是Function的结果
		System.out.println(Stream.of(1, 3, 4).collect(Collectors.reducing(0, x -> x + 1, (sum, b) -> {
			System.out.println(sum + "-" + b);
			return sum + b;
		})));
//		List<Integer> list = Arrays.asList(1, 2, 3);
//		Integer maxValue = list.stream().collect(Collectors.collectingAndThen(Collectors.maxBy((a, b) -> a - b), Optional::get));
//
//
//		Student s = new Student();
//		Student s1 = new Student();
//		System.out.println(s.toString().equals(s1.toString()));
	}

	@Test
	public void  test1(){
		IntStream intStream = IntStream.rangeClosed(1, 10);
		intStream.forEach(System.out::println);
		Boolean a = true;
		Boolean isForced = Optional.ofNullable(a).orElse(false);
		System.out.println(isForced);
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Integer reduce = list.stream().reduce(0, Integer::sum);
		System.out.println(reduce);
		Map<String,Object> map = new HashMap<>();
		map.put("11","aa");
		this.changeData.set(map);

		Map<String, Object> stringObjectMap = this.changeData.get();
		stringObjectMap.put("11","bb");
		Map<String, Object> stringObjectMap1 = this.changeData.get();
		System.out.println(stringObjectMap1);

	}


	public static void main(String[] args) {
		Consumer<String> con =System.out::println;
		con.accept("cess");
		Supplier<String> s = ()->"aa";
		String s1 = s.get();
		System.out.println(s1);
		System.out.println("1SB2038500283".startsWith("1S"));


		List<String> list = new ArrayList<String>();
		list.add("213abc");
		list.add("213abcd");
		Object obj = list;
		System.out.println(obj.getClass());
		List<Long> abc  = (List) obj;
		System.out.println(abc.getClass().getGenericSuperclass());
		System.out.println(abc.get(0));

/*		Map<String,Object> map  =new HashMap<>();
		List<String> list = new ArrayList<>();
		list.add("1231b");
		map.put("str",list);
		Object str = map.get("str");
		List<Integer> aa = (List<Integer>) str;
		System.out.println(aa.get(0));
		System.out.println(aa.getClass());*/



//		HashMap<String, Object> sourceMap = new HashMap<>();
//		sourceMap.put("name", "zhangsan");
//		sourceMap.put("address.home", "no1");
//		sourceMap.put("address.company", "no2");
//		sourceMap.put("parent.card.home", "no3");
//		sourceMap.put("parent.card.company", "no4");
//		sourceMap.put("parent.age", "45");
	}


	class Person1{
		int type ;

	}
	class Student extends  Person1{
		@Override
		public String toString() {
			return "Student{}";
		}


		public Student() {
			super.type=1;
		}
	}


	abstract class AbcClass{

    	public AbcClass(){
		    System.out.println(123);
	    }
	}

	class AbcSubClass extends AbcClass{
          public  AbcSubClass(){

          }

	}

	@Test
	public void Test1(){
		List<String> list = new ArrayList<>(Arrays.asList("1","2","3"));
//		for (String str : list){
//			if (str.equals("2")){
//				list.remove(str);
//			}
//		}


		for(String x:list){
			if(x.equals("2")){
				list.remove(x);
			}
		}

//		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));
//		for (Integer i  : list ){
//			if (i ==1){
//				list.remove(i);
//			}
//		}
		System.out.println(list);
    /*	List<String> list = Arrays.asList("12","34");
		String[] objects = list.toArray(new String[0]);
		System.out.println(objects.length);*/
//		List<String> list = Collections.unmodifiableList(Arrays.asList("12"));
//		String[] priceTypes = new String[]{};
//		Arrays.asList(priceTypes);

    }
}
