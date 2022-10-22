package com.lp.springxml.model;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotEmpty;

/**
 * @Author: liangpeng
 * @Date: 2021/12/26 11:15
 */
public class Person {
    @NotEmpty(message = "name不能为空")
    private String name;
    @Range(min = 1, max = 100, message = "age不能大于100小于0")
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(@NotEmpty(message = "name不能为空") String name, @Range(min = 1, max = 100, message = "age不能大于100小于0") int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }
}