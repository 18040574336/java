package com.lp;

import java.util.concurrent.Executors;

public class ClassLoadTest {

    public static void main(String[] args) {

        try {
            Class<?> xx = Class.forName("xx");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
