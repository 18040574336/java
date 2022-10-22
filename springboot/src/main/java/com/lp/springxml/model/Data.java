package com.lp.springxml.model;

import java.util.List;

/**
 * @Author: liangpeng
 * @Date: 2021/12/26 15:35
 */
public class Data {
    private List<Person> data;

    public Data(List<Person> data) {
        this.data = data;
    }

    public List<Person> getData() {
        return data;
    }

    public void setData(List<Person> data) {
        this.data = data;
    }
}
