package com.lp.springxml;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Author: liangpeng
 * @Date: 2021/10/24 18:44
 */
public class Testaaa {

    public static void main(String[] args) throws Exception{

       List<Long> list1 = new ArrayList<>();
       List<Long> list2 = new ArrayList<>();
       list1.add(1L);
       list1.add(2L);
       list1.add(3L);
       list1.add(4L);

        list2.add(1L);
        list2.add(2L);
        list1.removeAll(list2);

        System.out.println(list1);



    }

    public static void  println(Collection<?> list ){
        Class<? extends Collection> aClass = list.getClass();
        list.forEach(p-> System.out.println(p));

    }

}