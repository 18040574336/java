package com.lp.collection;

import java.util.ArrayList;
import java.util.List;

public class MapTest {
	public static void main(String[] args) {
		String aa = "aa";
		String bb = "aa";
		System.out.println(aa.compareTo(bb));
//		String str = "ET50A234201A0$A$1$后板簧限位块螺母板组件$零件$3$S$生协$$A3$0.51$$$$B$N$$$$$$$ERO8U000147$张向千$轴距3070$";
//		String[] split = str.split("\\$");
//		System.out.println(split.length);
//		for (int i =0;i<split.length;i++) {
//			System.out.println((i+1)+"==="+split[i]);
//		}
//		List<Long> list = Arrays.asList(1L,2L,3L);
//		Long[] longs = list.toArray(new Long[0]);
//		System.out.println(longs.length);

//		List arr1 = Arrays.asList(new Integer[]{123, 456});
//		System.out.println(arr1.size());//1
//		Integer o = (Integer) arr1.get(0);
//		System.out.println(o );
//		System.out.println(arr1.get(0));//1

//		List<Student> stu = new ArrayList<>();
//		stu.add(new Student("张三",23));
//		stu.add(new Student("李四",24));
//		stu.add(new Student("王五",25));
//
//		getChange(stu);
//
//		System.out.println(stu.size());
//		double a = 1.236343;
//		BigDecimal b = new BigDecimal(a);
//		double doubleValue = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
//		System.out.println(doubleValue);

//		 DecimalFormat df = new DecimalFormat("#.000");
//		 String str = df.format(a);
//		 System.out.println(str);

//		String format = String.format("%.2f", a);
//		System.out.println(format);


//		BigDecimal b1 = new BigDecimal(12334352.121);
//		BigDecimal b2 = new BigDecimal(43213.126);
//		BigDecimal divide = b1.divide(b2, 4, RoundingMode.HALF_UP);
//		System.out.println(divide);

//		BigDecimal a = new BigDecimal("1.0");
//		BigDecimal b = new BigDecimal("0.9");
//		BigDecimal c = new BigDecimal("0.8");
//
//		BigDecimal x = a.subtract(b);
//		BigDecimal y = b.subtract(c);
//
//		if (x.equals(y)) {
//			System.out.println("true");
//		}

//		float a = 1.0f - 0.9f;
//		float b = 0.9f - 0.8f;
//		System.out.println(a==b);
//		System.out.println(a);
//		System.out.println(b);


	}


	public  static void  getChange(List<Student> stu){
		List<Student> stu1 = new ArrayList<>();
		stu1.add(new Student("张三",23));
		stu1.add(new Student("李四",24));
		stu1.add(new Student("王五",25));
		stu1.add(new Student("赵刘",25));
		stu = stu1;

	}


	static class Student{

		private String name;
		private Integer age;


		public Student(String name, Integer age) {
			this.name = name;
			this.age = age;
		}

		public Student() {
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}
	}

}
