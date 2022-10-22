package com.lp.springxml;

class Value {
    int v;
}

class Solution {
    public static void main(String[] args) throws InterruptedException {
        int n = 100000;
        Value value = new Value();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < n; i++) {
                    value.v++;
                }
            }
        };
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(value.v);
    }
}