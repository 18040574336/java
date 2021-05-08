package com.lp.springxml;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.File;

/**
 * @Author: liangpeng
 * @Date: 2021/4/19 15:53
 */
public class TestA {

    public static void main(String[] args) {
        String imagePath ="/tcplmloc/eQube5_RemoteAdapter/tmp/81bb4d64-792c-4fe3-8f27-083c1b6d7e51/7c4717d29ed17a48de355112c499c877_1UkBHRpqYrThIB.BMP";
        String replace = imagePath.replace("/", File.separator);
        System.out.println(replace);
    }
}
