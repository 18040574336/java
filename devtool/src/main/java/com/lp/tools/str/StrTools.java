package com.lp.tools.str;

import org.junit.Test;

/**
 * @Author: liangpeng
 * @Date: 2021/9/9 22:31
 */
public class StrTools {


    /**
     * 首字母小写
     * Part=》part
     *
     */
    @Test
    public void Test(){
        char a= 'A'+32;
        char b ='a';
        System.out.println((int)a);
        System.out.println((int)b);


        String str = "PartService";
        char[] chars = str.toCharArray();
        chars[0] += 32;
        System.out.println(String.valueOf(chars));

    }
}
