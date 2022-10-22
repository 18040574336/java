package service.testservice;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.collection.ListUtil;
import cn.hutool.core.util.BooleanUtil;
import org.junit.jupiter.api.Test;
import service.TestService;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.time.Duration;
import java.util.*;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @Author: liangpeng
 * @Date: 2021/12/7 23:12
 */
public class TestServiceMain {
    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchMethodException {
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid.toString().length());
        Student s = new Student();
        Constructor<? extends Student> constructor = s.getClass().getConstructor();
        System.out.println(constructor);

    }


    public static String abc(Integer a){
        System.out.println("aaa"+a);
        return  "aaaabbccc";
    }

    @Test
    public  static  void test(){




//        Student s = new Student(1,"张三");
//        Student s1 = new Student(2,"李四");
//        Student s2 = new Student(3,"王五");
//        List<Student> list = new ArrayList<>();
//        list.add(s);
//        list.add(s1);
//        list.add(s2);
//        Stream<Student> stream = list.stream();
//        stream.distinct();
//        boolean b = stream.noneMatch(student -> student.getAge()>10);
//        System.out.println(b);


//        List<String> strList = new ArrayList<>();
//        List<String> strList1 = new ArrayList<>();
//        strList.add("111");
//        strList.add("222");
//        strList.add("333");
//        strList1.add("111");
//        strList.removeAll(strList1);



    }

    public String str (){
        return "aa";
    }


    public static void doSay(TestService testService){
    }
}
