package com.lp.springxml;

/**
 * @Author: liangpeng
 * @Date: 2021/5/17 13:08
 */
public  class Person implements Comparable<Person>{
    private String name;
    private Integer age;


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    public Person() {
    }
}
