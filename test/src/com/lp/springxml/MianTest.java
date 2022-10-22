package com.lp.springxml;

import java.util.*;
import java.util.stream.Collectors;

public class MianTest {

    public static void main(String[] args) {
        Long a =11111L;
        System.out.println(11111==a);
//        try {
//            Thread.sleep(1100);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }


    }

    public static boolean containsDuplicate(int[] nums) {
        //处理代码写在此处
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && i != j) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsDuplicate11(int[] arr) {
        for (int i = 0;i<arr.length;i++){
            if (arr[i] == arr[arr.length-i]){
                return true;
            }
        }
        return  false;

    }
}
