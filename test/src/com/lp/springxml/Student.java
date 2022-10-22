package com.lp.springxml;

/**
 * @Author: liangpeng
 * @Date: 2021/5/17 13:08
 */
public class Student extends Person {


    public static <T> T getString(T data){

        return data;
    }

    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, Integer age) {
        super(name);
        this.age = age;
    }
}
