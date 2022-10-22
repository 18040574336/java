package com.lp.Thread;

public class Thred07 {

    private static volatile   int count = 0;

    public static void main(String[] args) {
        new Thread(() -> count++).start();

        new Thread(() -> {

            System.out.println(count);}).start();



    }
}
