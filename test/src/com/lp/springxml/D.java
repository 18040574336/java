package com.lp.springxml;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Author: liangpeng
 * @Date: 2021/9/16 22:43
 */
public class D {
    public  static  final  String str = "123";
    public D(){

    }

    public static String testPublic(){

        return "public";
    }


    public static  <T> List<T> getList(){
        return new ArrayList<T>();
    }

    public static void main(String[] args) {
        List<String> list = D.getList();
    }
}

