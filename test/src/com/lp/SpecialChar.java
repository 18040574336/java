package com.lp;

import java.util.Comparator;

public class SpecialChar {

    public static void main(String[] args) {
         int a =1;
        Comparator<Integer> com = (x,y)->{
            return Integer.compare(x, y);
        };
        System.out.println("aaa\tbbb"); //aaa bbb
        System.out.println("aaa\nbbb");
        System.out.println("aaa" + "\r" + "bbb");//bbb
        System.out.println("aaa" + "\f" + "bbb");
    }
}
