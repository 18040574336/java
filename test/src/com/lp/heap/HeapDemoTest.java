package com.lp.heap;

/**
 * @Author: liangpeng
 * @Date: 2022/10/1 7:14
 * @Description:
 */

public class HeapDemoTest {
    public static void main(String[] args){

        new Thread(()->{
            while(true){
                System.out.println(123);

            }

        },"thread-01").start();



    }

    private static void set(int[] arr) {



    }
}
