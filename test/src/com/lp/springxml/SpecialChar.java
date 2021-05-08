package com.lp.springxml;

import java.util.*;

public class SpecialChar {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String, String>();
        map.put("cc","1");
        map.put("aa","2");
        map.put("ff","3");
        map.put("dd","4");
        map.put("5","5");
        map.forEach((k,v)->{
            System.out.println(k);
        });


        Set<String> set = new HashSet<>();
        set.add("S1");
        set.add("S4");
        set.add("S3");
        set.add("S2");
        set.add("S5");
        set.forEach(e-> System.out.print(e+" "));

    }
}
