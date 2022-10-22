package com.lp.jedis;


import java.util.*;

/**
 * @Author: liangpeng
 * @Date: 2022/4/26 14:27
 */
public class JedisDemo {

    private static final String REDIS_URL = "192.168.159.128";
    private static final int REDIS_PORT = 6379;

    public static void main(String[] args) {

     /*  Jedis jedis = new Jedis(REDIS_URL,REDIS_PORT);
       jedis.set("aa","bb");*/

       Set<String> set = new HashSet<>();
        boolean aa = set.add("aa");
        System.out.println(aa);
        boolean aa1 = set.add("aa");
        System.out.println(aa1);
    }
}
