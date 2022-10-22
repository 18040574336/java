package com.lp.Lambda;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @Author: liangpeng
 * @Date: 2021/10/19 15:24
 */
public class Test {



    public static void main(String[] args) {
          int count =11;
          long aa = 11;
        System.out.println(count == aa);
        
//        Predicate<Integer> predicate = x -> x > 185;
//        Student student = new Student("9龙", 23, 175);
//        System.out.println(
//                "9龙的身高高于185吗？：" + predicate.test(student.getHeight()));
//
//        Consumer<String> consumer = System.out::println;
//        consumer.accept("命运由我不由天");
//
//        Function<Student, String> function = Student::getName;
//        String name = function.apply(student);
//        System.out.println(name);
//
//        Supplier<Integer> supplier =
//                () -> Integer.valueOf(BigDecimal.TEN.toString());
//        System.out.println(supplier.get());
//
//        UnaryOperator<Boolean> unaryOperator = uglily -> !uglily;
//        Boolean apply2 = unaryOperator.apply(true);
//        System.out.println(apply2);
//
//        BinaryOperator<Integer> operator = (x, y) -> x * y;
//        Integer integer = operator.apply(2, 3);
//        System.out.println(integer);
//
//        test(() -> "我是一个演示的函数式接口");
    }

    /**
     * 演示自定义函数式接口使用
     *
     * @param worker
     */
    public static void test(Worker worker) {
        String work = worker.work();
        System.out.println(work);
    }

    public interface Worker {
        String work();
    }



    public void test1(){
        Student s = new Student();
        Student s1 = new Student();
        Student s2= new Student();

        List<Student> list = new ArrayList<>();
        list.add(s);
        list.add(s1);
        list.add(s2);


        Map<String, Student> collect = list.stream().collect(Collectors.toMap(stu->stu.getName()
        , student->student));

        collect.forEach((s3, student) -> System.out.println(s3 +"==="+student));
    }


    public static void testFilter(){
        List<Student> list = new ArrayList<>();
        list.add(new Student("11",20,160));
        list.add(new Student("22",21,160));
        list.add(new Student("33",18,160));
        list.add(new Student("44",15,160));

        test11(list);
        System.out.println("============");

        list.forEach(p->{
            System.out.println(p);
        });

    }

    public static void  test11(List<Student> list){
        list = list.stream().filter(p -> p.getAge() > 20).collect(Collectors.toList());
        System.out.println("============");
        list.forEach(p->{
            System.out.println(p);
        });
    }

    @SuppressWarnings("unchekcd")

    public static  <T> T  test111(Aaa<T> a ){
        return a.getA();
    }

}

class Aaa<T>{
    T  a;

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }
}
