package com.lp.string;

/**
 * @Author: liangpeng
 * @Date: 2021/3/5 10:47
 */
public class PersonDto {
    private String name;

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

    public PersonDto() {
    }
    public PersonDto(Person p) {
        this.name =p.getName();
        this.age = p.getAge();
    }
}
