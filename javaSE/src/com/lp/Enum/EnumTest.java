package com.lp.Enum;


/**
 * 一、枚举类的使用
 * 1、枚举类的理解:类的对象只有有限个，确定的。我们称此类为枚举类。
 * 2、当需要定义一组常量时，强烈建议使用枚举类。
 * 3、如果枚举类中只有一个对象，则可以作用单例模式的实现方式。
 *
 * 二、如何定义枚举类
 * 方式一：jdk5.0之前，自定义枚举类
 * 方式二：jdk5.0,可以使用enum关键字定义枚举类。
 *
 *
 * 三、Enum类中的常用方法：
 *    values()方法：返回枚举类型的对象数组,该方法可以很方便的遍历所有的枚举值。
 *    valueOf(String objName)：可以把一个字符串转为对应的枚举对象。要求字符串必须是枚举类对应的值。
 *    toString():返回当前枚举类对象常量名称。
 *
 * 四、使用enum关键字定义的枚举类实现接口的情况
 *  情况一: 实现接口，在enum类中实现抽象方法
 *  情况二: 让枚举类的对象分别实现接口中的抽象方法
 *
 *
 *
 *
 */

public class EnumTest {
	public static void main(String[] args) {
		Type a = Type.A;
		System.out.println(a.getName());
		System.out.println(Type.class.getSuperclass());

		//自定义枚举类测试
		Season spring = Season.SPRING;
		System.out.println(spring.getName());

		//enum测试
		Season1 spring1 = Season1.SPRING;
		System.out.println(spring1);
		//System.out.println(Season1.class.getSuperclass());
		//所有枚举对象
		Season1[] values = Season1.values();
		for (Season1 s :values){
			System.out.println(s);
		}
		//valueOf(String objName)：返回枚举类中对象名是objName的对象
		// 如果没有，则抛异常 java.lang.IllegalArgumentException
		Season1 spring2 = Season1.valueOf("SPRING");
		System.out.println(spring2);
		spring2.show();


	}
}

//使用enum关键字定义
//说明：定义的枚举类默认继承于java.lang.Enum类，当中重写了toString
enum Season1 implements Info{

	//1、提供当前枚举类的对象，多个对象之间用","隔开，末尾用";"结束。
	SPRING("春天","春乱花开"){
		@Override
		public void show() {
			System.out.println("春天");
		}
	},
	//情况二
    SUMMER("夏天","夏日炎炎"){
	    @Override
	    public void show() {
		    System.out.println("夏天");
	    }
    },
	AUTUMN("秋天","秋高气爽"){
		@Override
		public void show() {
			System.out.println("秋天");
		}
	},
	WINTER("冬天","冰天雪地"){
		@Override
		public void show() {
			System.out.println("冬天");
		}
	};

	//1、声明Season对象的属性：private final修饰
	private final String name;
	private final String desc;



	//2、私有化类的构造器，并给对象属性赋值
	private Season1(String name,String desc){
		this.name = name;
		this.desc = desc;
	}

	//情况一
//	@Override
//	public void show() {
//		System.out.println("这是一个季节");
//	}
}

enum Type{
	A("test"),B("test1"),C("test2");

	private final String name;

	Type(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

interface Info{
	void show();
}

//自定义枚举类
class Season{
	//1、声明Season对象的属性：private final修饰
	private final String name;
	private final String desc;

	//2、私有化类的构造器，并给对象属性赋值
	private Season(String name,String desc){
		this.name = name;
		this.desc = desc;
	}
	//3、提供当前枚举类的多个对象：public static final
	public static final  Season SPRING = new Season("春天","春乱花开");
	public static final  Season SUMMER = new Season("夏天","夏日炎炎");
	public static final  Season AUTUMN = new Season("秋天","秋高气爽");
	public static final  Season WINTER = new Season("冬天","冰天雪地");

	public String getName() {
		return name;
	}

	public String getDesc() {
		return desc;
	}

	@Override
	public String toString() {
		return "Season{" +
				"name='" + name + '\'' +
				", desc='" + desc + '\'' +
				'}';
	}
}


