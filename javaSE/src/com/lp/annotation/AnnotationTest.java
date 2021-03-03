package com.lp.annotation;

/***
 * 1、注解的使用示例
 *
 *示例一：生成文档相关的注解。
 *
 *示例二：在编译时进行格式检查(JDK内置的三个基本注解)
 * @Override:限定重写父类的方法,该注解只能用于方法。
 * @deprecated:用于表示所修饰的元素(类，方法等)已过时。
 * @SupperssWarnings：抑制编译器警告。
 *
 *示例三： 跟踪代码依赖性，实现替换配置文件功能
 *
 *
 *2、如何自定义注解：参照@SuppressWarnings定义
 * ① 注解声明为：@interface
 * ② 内部定义成员变量，通常使用value表示
 * ③ 可以指定成员的默认值，使用default定义
 * ④ 如果自定义注解没有成员，表明是一个标识作用。
 *
 * 如果有成员变量，在使用注解时，需要指明成员的值。
 * 自定义注解必须配上注解的信息处理流程(使用反射)才有意义。
 * 自定义注解通过都会指明两个注解：Retention,Target
 *
 *3、jdk提供的4种元注解
 *   元注解：对现有的注解进行解释说明的注解
 *   Retention:指明所修饰的Annotation的生命周期：SOUCRE/CALSS(默认)/RUNTIME：
 *         只有声明为RUNTIME生命周期的注解，才能通过反射获取。
 *         SOURCE:源代码中有效，编译时去掉。
 *         CLASS: 编译时有效，运行时无效。
 *         RUNTIME:运行时有效。
 *   Target：用于指定被修饰的Annotation都用于修饰那些程序元素
 *   Documented：表示所修饰的注解在被javadoc解析时，保留下来。
 *   Inherited:被它修饰的Annotation将具有继承性。
 *
 * 4、通过反射获取注解信息
 *
 * 5、
 *
 *
 *
 *
 *
 *
 *
 */
@MyAnnotation(value1 = "2",valuearr = {"aa","bb"})
public class AnnotationTest {
}

//自定义注解
@interface  MyAnnotation{

	//String value12() default  "hello"; //默认值
	String value1(); // 单个
	String[] valuearr(); // 数组




}
