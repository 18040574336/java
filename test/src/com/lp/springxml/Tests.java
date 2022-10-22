package com.lp.springxml;

import org.junit.Test;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author: liangpeng
 * @Date: 2021/5/12 9:52
 */
public class Tests {

    public static void main(String[] args) {
        HashMap m = new HashMap<Integer, String>();
        m.put(1, "nihao");
        // 利用反射,获取内部字段 "table"
        Class clsHashMap = null;
        Class clsHashMap$Node = null;
        Field[] f = null;
        Field t = null, fNode = null;
        try {
            clsHashMap = Class.forName("java.util.HashMap");
            clsHashMap$Node = Class.forName("java.util.HashMap$Node");
            f = clsHashMap.getDeclaredFields();
            AccessibleObject.setAccessible(f, true);
            for (Field field : f) {
                // System.out.println(field.getName());
                if (field.getName() == "table")
                    t = field;
            }
            Object[] O = ((Object[]) t.get(m));
            for (Object o : O) {
                if (o != null) {
                    System.out.println(o);
                    // Object e = clsHashMap$Node..newInstance();
                    fNode = clsHashMap$Node.getDeclaredField("next");
                    fNode.setAccessible(true);
                    while ((o = fNode.get(o)) != null) {
                        System.out.println(o);
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        // System.out.println(f.getName());
        catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }




    }

    @Test
    public void T2(){

        String consntStr = A.CONSNT_STR;
        parames("1","2");

    }

    public void parames(String ...args){


        System.out.println(args[0]);
//        for (String str :args){
//            System.out.println(str);
//        }


    }

    @Test
    public void T1(){

        D d = new D();
        System.out.println(d.testPublic());
        System.out.println(D.str);
        System.out.println(d.str);
        try {
            Class clszz =D.class;
            Method testPublic = D.class.getMethod("testPublic");
            try {
                Object invoke = testPublic.invoke(clszz, null);
                System.out.println(invoke);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        int a = 5/2;
        int b =36%2;
        System.out.println(a +"==="+b);

    }

    @Test
    public void test4(){

        Dog d = new Dog();
    }
}
