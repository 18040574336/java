package com.test.model;

/**
 * @Author: liangpeng
 * @Date: 2021/5/8 13:46
 */
public class UserA {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserA{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}